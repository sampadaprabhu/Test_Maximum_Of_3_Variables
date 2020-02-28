package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class maximumNumber {

    @Test
    public void testInteger1() {
        MaximumNumber maxNumber=new MaximumNumber(5,4,3);
        Comparable max = maxNumber.checkMaximum();
        Assert.assertEquals(5,max);
    }

    @Test
    public void testInteger2() {
        MaximumNumber maxNumber=new MaximumNumber(3,5,4);
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals(5,max);
    }

    @Test
    public void testInteger3() {
        MaximumNumber maxNumber=new MaximumNumber(4,3,5);
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals(5,max);
    }

    @Test
    public void testFloat1() {
        MaximumNumber maxNumber=new MaximumNumber(5.7f,3.2f,4.3f);
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals(5.7, (Float) max,1);
    }

    @Test
    public void testFloat2() {
        MaximumNumber maxNumber=new MaximumNumber(4.3f, 5.7f, 3.2f);
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals(5.7, (Float) max,1);
    }

    @Test
    public void testFloat3() {
        MaximumNumber maxNumber=new MaximumNumber(3.2f, 4.3f, 5.7f);
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals(5.7, (Float) max,1);
    }

    @Test
    public void testString1() {
        MaximumNumber maxNumber=new MaximumNumber("Peach","Banana","Apple");
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals("Largest Fruit Is : ", "Peach",max);
    }

    @Test
    public void testString2() {
        MaximumNumber maxNumber=new MaximumNumber("Apple","Peach","Banana");
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals("Largest Friut Is : ","Peach",max);
    }

    @Test
    public void testString3() {
        MaximumNumber maxNumber=new MaximumNumber("Banana","Apple","Peach");
        Comparable max=maxNumber.checkMaximum();
        Assert.assertEquals("Largest Fruit Is : ","Peach",max);
    }
}
