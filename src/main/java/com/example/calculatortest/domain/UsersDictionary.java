package com.example.calculatortest.domain;

import java.util.Hashtable;
import java.util.Objects;

public class UsersDictionary {
    Hashtable<String, String> userDictionary = new Hashtable<String, String>();

    public UsersDictionary() {
    }

    public void addUser(String name, String role) {
        userDictionary.put(name, role);
    }

    public boolean checkUserExist(String name, String role) {
        if (userDictionary.containsKey(name)) {
            return Objects.equals(userDictionary.get(name), role);
        } else return false;
    }
}
