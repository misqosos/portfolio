package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student michal = new Student("Michal", LocalDate.of(1996, Month.JULY, 26), "michaldrotar14@gmail.com");
            Student alex = new Student("Alex", LocalDate.of(1995, Month.JULY, 26), "alexdrotar14@gmail.com");

            studentRepository.saveAll(
                    List.of(michal, alex)
            );
        };
    }
}
