package com.fatimetou.patient.services;

import com.fatimetou.patient.dtos.StudentDto;
import com.fatimetou.patient.entities.Student;
import com.fatimetou.patient.mappers.StudentMapper;
import com.fatimetou.patient.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }
    public StudentDto saveStudent(Student student){
        Student student1 = new Student();
        student1.setUsername(student.getUsername());
        student1.setPassword(student.getPassword());
        return studentMapper.toStudentDto(studentRepository.save(student1));
    }
}
