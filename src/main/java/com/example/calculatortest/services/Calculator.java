package com.example.calculatortest.services;

import com.example.calculatortest.domain.UsersDictionary;

public class Calculator {
    UsersDictionary usersDict = null;

    public Calculator(UsersDictionary usersDict) {
        this.usersDict = new UsersDictionary();
        addUser("Gizi", "add");
    }

    public String calculate(String a, String b, String user, String opr) {

        String result = "";
        if (usersDict.checkUserExist(user, opr)) {
            result = add(a, b);
        } else {
            result = "Not existing rights!";
        }
        return result;
    }

    public String add(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public void addUser(String name, String role){
        usersDict.addUser(name, role);
    }
}
