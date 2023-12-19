package com.lms.Library.Management.System.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/greeting")
    public String sayHello() {
        return "Hello boy!";
    }
}
