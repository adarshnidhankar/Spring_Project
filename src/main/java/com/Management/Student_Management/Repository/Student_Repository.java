package com.Management.Student_Management.Repository;

import com.Management.Student_Management.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Student_Repository extends JpaRepository<Student,Integer> {

}
