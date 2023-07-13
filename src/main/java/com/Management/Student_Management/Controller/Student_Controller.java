package com.Management.Student_Management.Controller;

import com.Management.Student_Management.Entity.Student;
import com.Management.Student_Management.Service.Student_Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Student_Controller {
    private Student_Service studentService;

    public Student_Controller(Student_Service studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "studentsData";
    }

    @GetMapping("/students/new")
    public String addStudent(Model model) {
        Student student = new Student();
        model.addAttribute("studentNew", student);
        return "/student_form";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    int index;

    @GetMapping("/students/{id}")
    public String updateStudent(@PathVariable int id, Model model) {
        index = 0;
        for (Student student : studentService.getAllStudents()) {
            if (student.getStudentId() == id) {
                model.addAttribute("student", student);
            }
            index++;
        }
        return "update_student";
    }
    @PostMapping("/studentData")
    public String updateStudentMeth(Student student){
        studentService.getAllStudents().set(index,student);
        return "redirect:/students";
    }

//    @PostMapping("/students/{id}")
//    public String updateStudentMeth(@PathVariable int id, @ModelAttribute("student") Student student, Model model) {
//        //get student from databases by id
//        Student existingStudent = studentService.getStudentId(id);
//        existingStudent.setStudentId(id);
//        existingStudent.setStudentName(student.getStudentName());
//        existingStudent.setStudentEmail(student.getStudentEmail());
//        existingStudent.setStudentContact(student.getStudentContact());
//
//        //save updated onject
//        studentService.updateStudent(existingStudent);
//        return "redirect:/students";
//    }
}
