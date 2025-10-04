package com.example.student_management.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1l,
                        "Pluto",
                        "babypluto@tmail.com",
                        LocalDate.of(2001, Month.FEBRUARY, 2),
                        24)
        );

    }

}
