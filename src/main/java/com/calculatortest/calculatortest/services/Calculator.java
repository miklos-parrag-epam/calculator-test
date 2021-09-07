package com.calculatortest.calculatortest.services;

import com.calculatortest.calculatortest.domain.UsersDictionary;
import org.springframework.stereotype.Service;

@Service
public class Calculator extends UsersDictionary {
    static UsersDictionary users;

    public Calculator() {
        users = new UsersDictionary();
        users.addUser("Gizi", "add");
    }

    public static String calculate(String a, String b, String user, String opr) {

        String result = "";
        if (users.checkUserExist(user, opr)) {
            result = add(a, b);
        } else {
            result = "Not existing rights!";
        }
        return result;
    }

    public static String add(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
