package com.example.HibernateMappingAssignment.controller;

import com.example.HibernateMappingAssignment.model.Laptop;
import com.example.HibernateMappingAssignment.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    private LaptopService laptopService;
    @PostMapping("/laptop")
    public ResponseEntity<String> addLaptop(@RequestBody Laptop laptop){
        laptopService.add(laptop);
        return new ResponseEntity<>("laptop added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/laptop")
    public List<Laptop> getall(){
        return laptopService.getall();

    }

    @GetMapping("/laptop/{id}")
    public Laptop getbyId(@PathVariable Integer id){
        return laptopService.getbyId(id);
    }

    @PutMapping("/laptop/{id}")
    public ResponseEntity<String> ubdateLaptop(@RequestBody Laptop laptop, @PathVariable Integer id){
        laptopService.update(laptop,id);
        return new ResponseEntity<>("updated successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/laptop/{id}")
    public ResponseEntity<String> deleteLaptop(@PathVariable Integer id){
        laptopService.delete(id);
        return new ResponseEntity<>("deleted Successfully",HttpStatus.OK);
    }
}
