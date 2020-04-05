package com.example.introalgorithms;

import org.junit.Assert;
import org.junit.Test;

public class InsertionArraySortTest {

    private InsertionArraySort<Number> insertionSort = new InsertionArraySort<>();

    @Test
    public void sortAsc_alreadySorted() {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};

        Number[] actual = insertionSort.sortAsc(integers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortAsc_notSorted() {
        Integer[] integers = new Integer[]{4, 1, 5, 2, 3};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};

        Number[] actual = insertionSort.sortAsc(integers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortDesc_alreadySorted() {
        Integer[] integers = new Integer[]{5, 4, 3, 2, 1};
        Integer[] expected = new Integer[]{5, 4, 3, 2, 1};

        Number[] actual = insertionSort.sortDesc(integers);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortDesc_notSorted() {
        Integer[] integers = new Integer[]{4, 1, 5, 2, 3};
        Integer[] expected = new Integer[]{5, 4, 3, 2, 1};

        Number[] actual = insertionSort.sortDesc(integers);

        Assert.assertArrayEquals(expected, actual);
    }
}