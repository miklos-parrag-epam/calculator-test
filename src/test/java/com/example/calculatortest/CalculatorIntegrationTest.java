package com.example.calculatortest;

import com.example.calculatortest.domain.UsersDictionary;
import com.example.calculatortest.services.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CalculatorIntegrationTest {
    public static final String REAL_USER = "RealUser";
    public static final String ADD = "add";
    @Autowired
    Calculator calculator;

    @MockBean
    UsersDictionary usersDictionary;

    @BeforeEach
    public void setup() {
        when(usersDictionary.checkUserExist(REAL_USER, ADD)).thenReturn(true);
    }

    @Test
    public void testCalculateByUSer() {
        assertEquals("9", calculator.calculate("4", "5", REAL_USER, ADD));
        assertEquals("Not existing rights!", calculator.calculate("4", "5", "Other User", ADD));
    }
}
