package com.lms.Library.Management.System.Controllers;

import com.lms.Library.Management.System.Entities.Student;
import com.lms.Library.Management.System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}
