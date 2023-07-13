package com.Management.Student_Management.Service.impl;

import com.Management.Student_Management.Entity.Student;
import com.Management.Student_Management.Repository.Student_Repository;
import com.Management.Student_Management.Service.Student_Service;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Student_Service_Impl implements Student_Service {
    private Student_Repository studentRepository;

    public Student_Service_Impl(Student_Repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentId(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
