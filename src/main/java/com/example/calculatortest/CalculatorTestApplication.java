package com.example.calculatortest;

import com.example.calculatortest.domain.UsersDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CalculatorTestApplication {
	@Autowired
	UsersDictionary usersDictionary;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorTestApplication.class, args);
	}

	@PostConstruct
	void setup(){
		usersDictionary.addUser("Gizi", "add");
	}

}
