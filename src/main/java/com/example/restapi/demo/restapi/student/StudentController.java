package com.example.restapi.demo.restapi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // @Autowired annotation is a Spring tool to deal with Dependency Injection :
    // the studentService instance will automatically be injected into the constructor
    // BUT studentService MUST BE A JAVA BEAN, as so we must annotate studentservice with @Component for that to work
    // As our StudentService class is also a service we will instead annotate it with @Service for more readability
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getStudents(){
        return studentService.getStudents();

    }

    @PostMapping("/")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

}
