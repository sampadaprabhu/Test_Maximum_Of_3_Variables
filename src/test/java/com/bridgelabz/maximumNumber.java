package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class maximumNumber {

    MaximumNumber maxNumber;
    @Before
    public void setUp() throws Exception {
        maxNumber=new MaximumNumber();
    }
    //MaximumNumber maxNumber=new MaximumNumber();
    @Test
    public void testInteger1() {
        int max=maxNumber.getMaxIntegerNumber(5,4,3);
        Assert.assertEquals(5,max);
    }

    @Test
    public void testInteger2() {
        int max=maxNumber.getMaxIntegerNumber(3,5,4);
        Assert.assertEquals(5,max);
    }

    @Test
    public void testInteger3() {
        int max=maxNumber.getMaxIntegerNumber(4,3,5);
        Assert.assertEquals(5,max);
    }

    @Test
    public void testFloat1() {
        float max=maxNumber.getMaxFloatNumber(5.7f, 3.2f,4.3f);
        Assert.assertEquals(5.7,max,1);
    }

    @Test
    public void testFloat2() {
        float max=maxNumber.getMaxFloatNumber(4.3f, 5.7f, 3.2f);
        Assert.assertEquals(5.7,max,1);
    }

    @Test
    public void testFloat3() {
        float max=maxNumber.getMaxFloatNumber(3.2f, 4.3f, 5.7f);
        Assert.assertEquals(5.7,max,1);
    }

    @Test
    public void testString1() {
        String max=maxNumber.getMaxString("Peach","Banana","Apple");
        Assert.assertEquals("Largest Fruit Is : ", "Peach",max);
    }

    @Test
    public void testString2() {
        String max=maxNumber.getMaxString("Apple","Peach","Banana");
        Assert.assertEquals("Largest Friut Is : ","Peach",max);
    }

    @Test
    public void testString3() {
        String max=maxNumber.getMaxString("Banana","Apple","Peach");
        Assert.assertEquals("Largest Fruit Is : ","Peach",max);
    }

}
