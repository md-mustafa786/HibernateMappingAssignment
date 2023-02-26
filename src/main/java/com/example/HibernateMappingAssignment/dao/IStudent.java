package com.example.HibernateMappingAssignment.dao;

import com.example.HibernateMappingAssignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent extends JpaRepository<Student,Integer> {
}
