package com.example.calculatortest;

import com.example.calculatortest.domain.UsersDictionary;
import com.example.calculatortest.services.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCalculator {
    static Calculator calculator = null;
    @Mock
    UsersDictionary usersDictionaryMock;


    @Test
    public void testAdd() {
        calculator = new Calculator(null);
        assertEquals("2", calculator.add("1", "1"));
    }


    @Test
    public void testCalculateMock() {
        String testA = "4";
        String testB = "5";
        String testUser = "Rozi";
        String testOpr = "add";

        when(usersDictionaryMock.checkUserExist(testUser, testOpr)).thenReturn(true);
        calculator = new Calculator(usersDictionaryMock);
        assertEquals("9", calculator.calculate(testA, testB, testUser, testOpr));
        verify(usersDictionaryMock).checkUserExist(testUser, testOpr);
    }
}
