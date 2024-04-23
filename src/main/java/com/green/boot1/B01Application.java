package com.green.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // AuditingEntityListener 활성화 위해 추가해야함.
public class B01Application {

    public static void main(String[] args) {
        SpringApplication.run(B01Application.class, args);
    }
}
