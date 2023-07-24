package com.example.rentacar.controller;

import com.example.rentacar.model.Student;
import com.example.rentacar.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Greeting(){
       return "Hello SpringBoot ";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String Greeting2(){
        return "Hello SpringBoot from POST method";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student Save(@RequestBody Student student){
         return studentService.save(student);
    }


    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){
        Student student = studentService.fetchStudentById(id);
        if (student==null){
            ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
        return null;
    }
}
