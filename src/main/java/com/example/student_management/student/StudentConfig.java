package com.example.student_management.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "pluto@tmail.com",
                    LocalDate.of(2000, FEBRUARY, 21),
                    25
            );
            Student alec = new Student(
                    "alec",
                    "baby@tmail.com",
                    LocalDate.of(2002, FEBRUARY, 23),
                    23
            );
            repository.saveAll(List.of(mariam, alec));
        };
    }
}
