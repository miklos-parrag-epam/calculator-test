package com.calculatortest.calculatortest.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class HelloServiceTest {

    HelloService testHelloService = null;

    @Test
    public void testHello() {
        testHelloService = new HelloService();

        assertEquals("Hello World!", testHelloService.hello(), "Test hello");
        assertNotEquals("Good bye World!", testHelloService.hello(), "Counter Test hello");
    }

}