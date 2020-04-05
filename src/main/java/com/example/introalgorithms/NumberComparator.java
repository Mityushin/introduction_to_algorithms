package com.example.introalgorithms;

import java.math.BigDecimal;
import java.util.Comparator;

public class NumberComparator implements Comparator<Number> {
    @Override
    public int compare(Number n1, Number n2) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(n1.doubleValue());
        BigDecimal bigDecimal2 = BigDecimal.valueOf(n2.doubleValue());
        return bigDecimal1.compareTo(bigDecimal2);
    }
}
