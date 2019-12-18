package com.maxwit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Junit5Test {

    @Test
    public void testCalculateInterest() {
        MyClass testMyClass = new MyClass();
        int res = testMyClass.caculater(1, 2);
        assertEquals(3, res, "The result is correct");
    }
}
