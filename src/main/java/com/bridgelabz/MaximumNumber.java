package com.bridgelabz;

public class MaximumNumber {
    public static <E extends Comparable<E>> E getMaximum(E x, E y, E z) {
        E maximum = x;
        if(y.compareTo(maximum)>0){
            maximum=y;
        }
        if (z.compareTo(maximum)>0){
            maximum=z;
        }
        return maximum;
    }
}