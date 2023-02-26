package com.example.HibernateMappingAssignment.service;

import com.example.HibernateMappingAssignment.dao.IBook;
import com.example.HibernateMappingAssignment.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private IBook iBook;
    public void add(Book book) {
        iBook.save(book);
    }

    public List<Book> getall() {
        return iBook.findAll();
    }

    public Book getbyId(Integer id) {
        return iBook.findById(id).get();
    }

    public void update(Book newbook, Integer id) {
        Book bo = iBook.findById(id).get();
       // bo.setID(newbook.getID());
        bo.setAuthor(newbook.getAuthor());
        bo.setDescription(newbook.getDescription());
        bo.setTitle(newbook.getTitle());
        bo.setPrice(newbook.getPrice());
        iBook.save(bo);
    }

    public void delete(Integer id) {
        iBook.deleteById(id);
    }
}
