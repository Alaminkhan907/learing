package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
            new Student(
				1,
                "MARIA",
                "maria@maria.com",
                LocalDate.of(2000, 1, 3),
                21
            )
        );
    }
}
