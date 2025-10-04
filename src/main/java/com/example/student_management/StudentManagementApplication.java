package com.example.student_management;

import com.example.student_management.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

    @GetMapping
    public List<Student> hello(){
        return List.of(new Student(1l, "Pluto", "babypluto@tmail.com", LocalDate.of(2001, Month.FEBRUARY, 2), 24));
    }

}
