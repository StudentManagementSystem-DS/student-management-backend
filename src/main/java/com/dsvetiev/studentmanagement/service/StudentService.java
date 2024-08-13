package com.dsvetiev.studentmanagement.service;

import com.dsvetiev.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService implements IStudentService {


    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return List.of();
    }

    @Override
    public Student updateStudents(Student student, Long id) {
        return null;
    }

    @Override
    public Student getStudentId(Long id) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
