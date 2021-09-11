package com.example.calculatortest;

import com.example.calculatortest.domain.UsersDictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestUserDictionary {
    UsersDictionary usersDict = null;

    @BeforeEach
    void init() {
        usersDict = new UsersDictionary();

    }

    @Test
    public void testEmpty() {
        String testUser = "Gizi";
        String testOpr = "add";
        assertFalse(usersDict.checkUserExist(testUser, testOpr));

    }

    @Test
    public void testAddUser() {
        String testUser = "Gizi";
        String testOpr = "add";
        usersDict.addUser(testUser, testOpr);
        assertTrue(usersDict.checkUserExist(testUser, testOpr));
    }
}
