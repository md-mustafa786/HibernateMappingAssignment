package com.example.HibernateMappingAssignment.dao;

import com.example.HibernateMappingAssignment.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBook extends JpaRepository<Book,Integer> {
}
