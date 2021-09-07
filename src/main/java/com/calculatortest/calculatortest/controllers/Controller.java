package com.calculatortest.calculatortest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.calculatortest.calculatortest.services.Calculator.calculate;
import static com.calculatortest.calculatortest.services.HelloService.hello;

@RestController
public class Controller {
    @RequestMapping("/")
    public String index() {
        return hello();
    }

    @GetMapping("/calc")
    public String calc(@RequestParam String a, @RequestParam String b, @RequestParam String user, @RequestParam String opr) {
        return calculate(a, b, user, opr);
    }

}
