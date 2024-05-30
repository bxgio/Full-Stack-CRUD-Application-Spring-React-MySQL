package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Student record updated";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student record deleted";
    }
}
