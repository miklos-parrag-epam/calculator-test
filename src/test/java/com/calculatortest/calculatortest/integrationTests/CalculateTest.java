package com.calculatortest.calculatortest.integrationTests;

import com.calculatortest.calculatortest.domain.UsersDictionary;
import com.calculatortest.calculatortest.services.Calculator;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
public class CalculateTest {
    private final UsersDictionary users = Mockito.mock(UsersDictionary.class);
    private Calculator testCalculator = null;

    @Test
    public void testCalculateMock() {

        String testA = "4";
        String testB = "5";
        String testUser = "Rozi";
        String testOpr = "add";

        when(users.checkUserExist(testUser, testOpr)).thenReturn(true);
        testCalculator = new Calculator();

        assertEquals("9", testCalculator.calculate(testA, testB, testUser, testOpr), "Testing calculate with mock.");
        verify(users, times(1)).checkUserExist(testUser, testOpr);


    }
}
