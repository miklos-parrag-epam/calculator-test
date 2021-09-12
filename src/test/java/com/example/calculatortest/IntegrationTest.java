package com.example.calculatortest;

import com.example.calculatortest.domain.UsersDictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    public static final String MOCKUSER = "MockUser";
    public static final String ADD = "add";

    @MockBean
    UsersDictionary usersDictionary;

    @BeforeEach
    public void setup() {
        when(usersDictionary.checkUserExist(MOCKUSER, ADD)).thenReturn(true);
    }

    @Test
    public void testCalculateByUSer() {
        assertEquals("4", testRestTemplate.getForObject("/calc?a=1&b=3&user=MockUser&opr=add", String.class, Map.of()));
        assertEquals("Not existing rights!", testRestTemplate.getForObject("/calc?a=1&b=3&user=NotExistUSer&opr=add", String.class, Map.of()));
    }

}
