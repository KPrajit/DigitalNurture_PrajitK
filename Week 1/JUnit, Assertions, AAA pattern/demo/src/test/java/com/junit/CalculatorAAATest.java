package com.junit;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {
    Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Before Test");
    }

    @After
    public void tearDown() {
        System.out.println("After Test");
    }

    @Test
    public void testMultiply() {
        
        int a = 4;
        int b = 5;

        
        int result = calc.multiply(a, b);

        
        assertEquals(20, result);
    }

    @Test
    public void testSubtract() {

        
        int a = 8;
        int b = 3;

        
        int result = calc.subtract(a, b);

        
        assertEquals(5, result);
    }
}