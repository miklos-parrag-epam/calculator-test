package com.example.calculatortest;


import com.example.calculatortest.domain.UsersDictionary;
import com.example.calculatortest.services.Calculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
public class TestCalculator {
    UsersDictionary usersDictionary = new UsersDictionary();
    static Calculator calculator = null;
    @Mock
    UsersDictionary usersDictionaryMock = mock(UsersDictionary.class);


    @Test
    public void testAdd() {
        calculator = new Calculator(usersDictionary);
        assertEquals("2", calculator.add("1", "1"));
    }

    @Test  //integration test
    public void testCalculateReal() {
        String testA = "4";
        String testB = "5";
        String testUser = "Rozi";
        String testOpr = "add";
        calculator = new Calculator(usersDictionary);
        calculator.addUser(testUser, testOpr);
        assertEquals("9", calculator.calculate(testA, testB, testUser, testOpr));

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
        verify(usersDictionaryMock, times(1)).checkUserExist(testUser, testOpr);


    }
}
