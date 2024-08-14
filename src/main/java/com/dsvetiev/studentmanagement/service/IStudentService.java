package com.dsvetiev.studentmanagement.service;

import com.dsvetiev.studentmanagement.model.Student;

import java.util.List;

public interface IStudentService {

    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudents(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);

}
