package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentController {
    @GetMapping
    public List<Student> students(){
        return List.of(
                new Student(
                        1L,
                        "Michal",
                        LocalDate.of(1996, Month.JULY, 26),
                        "michaldrotar14@gmail.com",
                        27
                )
        );
    }
}
