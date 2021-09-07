package com.calculatortest.calculatortest.services;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CalculatorTest {

    private Calculator testCalculator = null;

    @Test
    public void testAdd() {
        testCalculator = new Calculator();
        String testA = "1";
        String testB = "2";

        assertEquals("3", testCalculator.add(testA, testB), "Testing the addition.");
        assertNotEquals("4", testCalculator.add(testA, testB), "Testing failing the addition.");
    }


}