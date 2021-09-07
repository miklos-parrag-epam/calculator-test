package com.calculatortest.calculatortest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.calculatortest.calculatortest.services.HelloService.hello;

@RestController
public class Controller {
    @RequestMapping("/")
    public String index(){
        return hello();
    }
}
