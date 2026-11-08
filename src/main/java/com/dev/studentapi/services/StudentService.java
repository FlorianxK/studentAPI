package com.dev.studentapi.services;

import com.dev.studentapi.models.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
