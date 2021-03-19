package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.jvm.hotspot.code.Stub;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    List<Integer> list;
    List<Integer> expected;

    public void setupLists(){
        this.list = Arrays.asList(1,2,4,2,5);
        this.expected = Arrays.asList(1,2,4,5);
    }

    public void setupLists_bug_8726(){
        this.list = Arrays.asList(1,2,4,2);
        this.expected = Arrays.asList(1,2,4);
    }

    @Test
    public void deduplicate() {
        setupLists();

        GenericListSorter listSorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(listSorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4,5));

        ListDeduplicator deduplicator = new ListDeduplicator(listSorter);
        List<Integer> distinct = deduplicator.deduplicate(this.list);

        Assertions.assertEquals(this.expected, distinct);
    }

    @Test
    public void deduplicate_bug_8726(){
        setupLists_bug_8726();

        GenericListSorter listSorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(listSorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4));

        ListDeduplicator deduplicator = new ListDeduplicator(listSorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
}
