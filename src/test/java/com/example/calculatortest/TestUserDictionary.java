package com.example.calculatortest;

import com.example.calculatortest.domain.UsersDictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestUserDictionary {
    public static final String TEST_OPR = "add";
    public static final String DUMMY_USER = "Dummy User";
    UsersDictionary usersDict;

    @BeforeEach
    public void setup(){
        usersDict = new UsersDictionary();
    }

    @Test
    public void testEmpty() {
        assertFalse(usersDict.checkUserExist(DUMMY_USER, TEST_OPR));
    }

    @Test
    public void testAddUser() {
        usersDict.addUser(DUMMY_USER, TEST_OPR);
        assertTrue(usersDict.checkUserExist(DUMMY_USER, TEST_OPR));
    }
}
