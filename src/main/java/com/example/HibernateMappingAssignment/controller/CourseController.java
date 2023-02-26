package com.example.HibernateMappingAssignment.controller;

import com.example.HibernateMappingAssignment.model.Course;
import com.example.HibernateMappingAssignment.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;
    @PostMapping("/Course")
    public ResponseEntity<String> addBook(@RequestBody Course course){
        courseService.addCourse(course);
        return new ResponseEntity<>("course added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/course")
    public List<Course> getall(){
        return courseService.getallCourse();

    }

    @GetMapping("/course/{id}")
    public Course getbyId(@PathVariable Integer id){
        return courseService.getbyId(id);
    }

    @PutMapping("/course/{id}")
    public ResponseEntity<String> ubdateCourse(@RequestBody Course course, @PathVariable Integer id){
        courseService.update(course,id);
        return new ResponseEntity<>("updated successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/course/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer id){
        courseService.delete(id);
        return new ResponseEntity<>("deleted Successfully",HttpStatus.OK);
    }

}
