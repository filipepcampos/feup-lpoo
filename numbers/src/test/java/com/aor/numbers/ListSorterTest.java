package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListSorterTest {
    List<Integer> list;
    List<Integer> expected;

    @BeforeEach
    public void setupLists(){
        this.list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        this.expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }

    @Test
    public void sort() {
        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(this.list);

        Assertions.assertEquals(this.expected, sorted);
    }

    @Test
    public void sort_bug_8726(){
        List<Integer> list = Arrays.asList(1,2,4,2);
        List<Integer> expected = Arrays.asList(1,2,2,4);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }
}
