package com.calculatortest.calculatortest;

import com.calculatortest.calculatortest.services.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestHelloService {

    HelloService testHelloService = null;

    @Test
    public void testHello() {
        testHelloService = new HelloService();

        assertEquals("Hello World!", testHelloService.hello(),"Test hello");
    }

}