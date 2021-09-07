package com.calculatortest.calculatortest.domain;

import com.calculatortest.calculatortest.interfaces.Users;
import org.springframework.stereotype.Repository;

import java.util.Hashtable;
import java.util.Objects;

@Repository
public class UsersDictionary implements Users {
    Hashtable<String, String> userDictionary = new Hashtable<String, String>();

    public void addUser(String name, String role) {
        userDictionary.put(name, role);
    }

    @Override
    public boolean checkUserExist(String name, String role) {
        if (userDictionary.containsKey(name)) {
            return Objects.equals(userDictionary.get(name), role);
        } else return false;
    }
}
