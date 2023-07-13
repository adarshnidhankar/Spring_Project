package com.Management.Student_Management.Service;

import com.Management.Student_Management.Entity.Student;

import java.util.List;

public interface Student_Service {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentId(int id);

    Student updateStudent(Student student);

    void deleteStudentById(int id);
}
