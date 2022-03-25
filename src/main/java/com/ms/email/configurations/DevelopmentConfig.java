package com.ms.email.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevelopmentConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

    }
}
