package com.aor.numbers;

import org.graalvm.compiler.api.replacements.Fold;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import sun.jvm.hotspot.utilities.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    public List<Integer> setupList(){
        return Arrays.asList(1,2,4,2,5);
    }

    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(setupList());

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(setupList());

        Assertions.assertEquals(5, max);
    }

    @Test
    public void max_bug_7263() {
        List<Integer> list = Arrays.asList(-1, -4, -5);
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(-1, max);
    }

    @Test
    public void min() {
        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(setupList());

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1,2,4,5));
        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(setupList(), deduplicator);

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void distinct_bug_8726(){
        List<Integer> list = Arrays.asList(1,2,4,2);
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1,2,4));

        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list, deduplicator);
        Assertions.assertEquals(3, distinct);
    }
}
