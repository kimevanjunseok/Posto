package com.evan.posto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PostoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostoApplication.class, args);
    }

}
