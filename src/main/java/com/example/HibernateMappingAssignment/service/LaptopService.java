package com.example.HibernateMappingAssignment.service;

import com.example.HibernateMappingAssignment.dao.ILaptop;
import com.example.HibernateMappingAssignment.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
   private ILaptop iLaptop;
    public void add(Laptop laptop) {
        iLaptop.save(laptop);
    }

    public List<Laptop> getall() {
        return iLaptop.findAll();
    }

    public Laptop getbyId(Integer id) {
        return iLaptop.findById(id).get();
    }

    public void update(Laptop newlaptop, Integer id) {
        Laptop la = iLaptop.findById(id).get();
        la.setBrand(newlaptop.getBrand());
        la.setName(newlaptop.getName());
        la.setPrice(newlaptop.getPrice());
        iLaptop.save(la);
    }

    public void delete(Integer id) {
        iLaptop.deleteById(id);
    }
}
