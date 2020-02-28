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

}
