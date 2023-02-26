package com.example.HibernateMappingAssignment.dao;

import com.example.HibernateMappingAssignment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourse extends JpaRepository<Course,Integer> {
}
