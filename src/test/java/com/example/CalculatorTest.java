package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(10, 2));
    }
}