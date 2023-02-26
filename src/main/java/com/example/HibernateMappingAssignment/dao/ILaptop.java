package com.example.HibernateMappingAssignment.dao;

import com.example.HibernateMappingAssignment.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptop extends JpaRepository<Laptop,Integer> {
}
