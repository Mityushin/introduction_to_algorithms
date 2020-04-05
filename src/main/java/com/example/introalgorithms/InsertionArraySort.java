package com.example.introalgorithms;

import java.util.Comparator;
import java.util.Objects;

public class InsertionArraySort<T extends Number> implements ArraySort<T> {

    private static final Comparator<Number> NUMBER_COMPARATOR_ASC = new NumberComparator();
    private static final Comparator<Number> NUMBER_COMPARATOR_DESC = NUMBER_COMPARATOR_ASC.reversed();

    public T[] sortAsc(T[] array) {
        return sort(Objects.requireNonNull(array), NUMBER_COMPARATOR_ASC);
    }

    public T[] sortDesc(T[] array) {
        return sort(Objects.requireNonNull(array), NUMBER_COMPARATOR_DESC);
    }

    private T[] sort(T[] array, Comparator<Number> comparator) {
        for (int i = 1; i < array.length; i++) {
            T curr = array[i];
            int j = i - 1;
            while (j >= 0) {
                if (comparator.compare(array[j], curr) > 0) {
                    // move value
                    array[j + 1] = array[j];
                    array[j] = curr;
                } else {
                    break;
                }
                j--;
            }
        }
        return array;
    }
}
