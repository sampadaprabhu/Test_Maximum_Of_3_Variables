package com.bridgelabz;

public class MaximumNumber {
    public int getMaxIntegerNumber(int x, int y, int z) {
        int maximum = x;
        if(Integer.compare(y,maximum)>0){
            maximum=y;
        }
        if (Integer.compare(z,maximum)>0){
            maximum=z;
        }
        return maximum;
    }
}