package com.example.calculatortest.controllers;

import com.example.calculatortest.services.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Calculator calc;

    @GetMapping("/calc")
    public String calc(@RequestParam String a, @RequestParam String b, @RequestParam String user, @RequestParam String opr) {
        return calc.calculate(a, b, user, opr);
    }

}
