package com.example.HibernateMappingAssignment.controller;

import com.example.HibernateMappingAssignment.model.Student;
import com.example.HibernateMappingAssignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.add(student);
        return new ResponseEntity<>("student added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/student")
    public List<Student> getall(){
        return studentService.getall();

    }

    @GetMapping("/student/{id}")
    public Student getbyId(@PathVariable Integer id){
        return studentService.getbyId(id);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<String> ubdateStudent(@RequestBody Student student, @PathVariable Integer id){
        studentService.update(student,id);
        return new ResponseEntity<>("updated successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
        studentService.delete(id);
        return new ResponseEntity<>("deleted Successfully",HttpStatus.OK);
    }
}
