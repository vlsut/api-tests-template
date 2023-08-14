package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void oneShouldBeEqualToOne() {
        Assert.assertEquals(1, 1);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void shouldNotLetDivisionByZero() {
        System.out.println("I'm going to do something bad ( ͡° ͜ʖ ͡°)");
        Integer number = 1 / 0;
    }
}
