package com.fatimetou.patient.mappers;

import com.fatimetou.patient.dtos.StudentDto;
import com.fatimetou.patient.entities.Student;

public class StudentMapper {

    public StudentDto toStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setPassword(studentDto.getPassword());
        studentDto.setUsername(studentDto.getUsername());
        return studentDto;
    }

    public Student toStudent(StudentDto studentDto){
        Student student = new Student();
        student.setPassword(student.getPassword());
        student.setUsername(student.getPassword());
        return student;
    }

}
