package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    Optional<Student> getStudentById(int id);
    List<Student> getAllStudents();
    Student updateStudent(Student student);
    void deleteStudent(int id);
}
