package com.example.calculatortest.services;

import com.example.calculatortest.domain.UsersDictionary;
import org.springframework.stereotype.Service;


@Service
public class Calculator {
    private final UsersDictionary usersDict;

    public Calculator(UsersDictionary usersDict) {
        this.usersDict = usersDict;
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

}
