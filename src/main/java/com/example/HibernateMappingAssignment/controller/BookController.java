package com.example.HibernateMappingAssignment.controller;

import com.example.HibernateMappingAssignment.model.Book;
import com.example.HibernateMappingAssignment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
       bookService.add(book);
       return new ResponseEntity<>("book added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/book")
    public List<Book> getall(){
        return bookService.getall();

    }

    @GetMapping("/book/{id}")
    public Book getbyId(@PathVariable Integer id){
        return bookService.getbyId(id);
    }

    @PutMapping("/book/{id}")
    public ResponseEntity<String> ubdateBook(@RequestBody Book book, @PathVariable Integer id){
        bookService.update(book,id);
        return new ResponseEntity<>("updated successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/book/{id}")
   public ResponseEntity<String> deleteBook(@PathVariable Integer id){
        bookService.delete(id);
        return new ResponseEntity<>("deleted Successfully",HttpStatus.OK);
    }
}
