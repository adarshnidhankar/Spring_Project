package com.Management.Student_Management;

import com.Management.Student_Management.Entity.Student;
import com.Management.Student_Management.Repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private Student_Repository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student(1,"adarsh","adarsh@gmail.com",95612);
//		studentRepository.save(student);
//		Student student1 = new Student(2,"vijay","adarsh@gmail.com",95612);
//		studentRepository.save(student1);
//		Student student2 = new Student(3,"samarth","adarsh@gmail.com",95612);
//		studentRepository.save(student2);
	}
}
