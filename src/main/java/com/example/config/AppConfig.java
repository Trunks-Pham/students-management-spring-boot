package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.repository.StudentRepository;

@Configuration
public class AppConfig {

    @Autowired
    private StudentRepository studentRepository;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Welcome to the Spring Boot application!");
            
        };
    }
}