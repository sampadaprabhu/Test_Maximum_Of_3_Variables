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

    public float getMaxFloatNumber(float x, float y, float z) {
        float maximum = x;
        if(Float.compare(y , maximum) > 0){
            maximum= y;
        }
        if(Float.compare(z,maximum)>0){
            maximum=z;
        }
        return maximum;
    }
    public String getMaxString(String fruit1, String fruit2, String fruit3) {
        String maximum = fruit1;
        if(fruit2.compareTo(maximum)>0){
            maximum=fruit2;
        }
        if (fruit3.compareTo(maximum)>0){
            maximum=fruit3;
        }
        return maximum;
    }
}