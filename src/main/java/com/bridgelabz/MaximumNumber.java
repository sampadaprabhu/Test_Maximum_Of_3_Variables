package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber <E extends Comparable<E>>{
    E x;
    E y;
    E z;

    public MaximumNumber(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public E checkMaximum(){
        return getMaximum(x,y,z);
    }
    public static <E extends Comparable<E>> E getMaximum(E x, E y, E z, E... arrayValues) {
        E maximum = x;
        if(y.compareTo(maximum)>0){
            maximum=y;
        }
        if (z.compareTo(maximum)>0){
            maximum=z;
        }
        if(arrayValues.length !=0){
            //    for (E i: arrayValues) {
//                if (maximum.compareTo(i)<0){
//                    maximum=i;
//                }
//            }
            Arrays.sort(arrayValues, Collections.reverseOrder());
            if (maximum.compareTo(arrayValues[0])<0){
                maximum=arrayValues[0];
            }
        }
        printMaximum(maximum);
        return maximum;
    }

    private static <E extends Comparable<E>> void printMaximum(E maximum) {
        System.out.println("The Maximum Is : "+maximum);
    }
}