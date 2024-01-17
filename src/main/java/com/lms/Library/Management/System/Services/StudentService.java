package com.lms.Library.Management.System.Services;

import com.lms.Library.Management.System.Entities.Student;
import com.lms.Library.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added succesfully";
    }
}
