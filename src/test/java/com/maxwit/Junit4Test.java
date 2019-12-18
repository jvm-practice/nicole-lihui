package com.maxwit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Junit4Test {

    @Test
    public void testCalculateInterest() {
        MyClass testMyClass = new MyClass();
        int res = testMyClass.caculater(1, 2);
        assertEquals(3, res);
    }

}
