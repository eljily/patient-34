package com.fatimetou.patient.controllers;

import com.fatimetou.patient.dtos.StudentDto;
import com.fatimetou.patient.entities.Student;
import com.fatimetou.patient.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDto addNew(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
}
