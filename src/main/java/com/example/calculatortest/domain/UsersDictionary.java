package com.example.calculatortest.domain;

import org.springframework.stereotype.Repository;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

@Repository
public class UsersDictionary {
    Map<String, String> userDictionary = new Hashtable<>();

    public void addUser(String name, String role) {
        userDictionary.put(name, role);
    }

    public boolean checkUserExist(String name, String role) {
        if (userDictionary.containsKey(name)) {
            return Objects.equals(userDictionary.get(name), role);
        } else return false;
    }
}
