package com.project.checkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CheckInApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheckInApplication.class, args);
    }

}
