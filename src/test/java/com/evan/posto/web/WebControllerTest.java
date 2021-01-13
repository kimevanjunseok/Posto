package com.evan.posto.web;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class WebControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void loadMainPage() {
        // when
        String body = this.restTemplate.getForObject("/", String.class);

        // then
        assertThat(body).contains("스프링부트로 시작하는 웹 서비스");
    }
}