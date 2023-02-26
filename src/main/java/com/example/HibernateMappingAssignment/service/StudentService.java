package com.example.HibernateMappingAssignment.service;

import com.example.HibernateMappingAssignment.dao.IStudent;
import com.example.HibernateMappingAssignment.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {

    @Autowired
   private IStudent iStudent;
    public void add(Student student) {
        iStudent.save(student);
    }

    public List<Student> getall() {
        return iStudent.findAll();
    }

    public Student getbyId(Integer id) {
        return iStudent.findById(id).get();
    }

    public void update(Student newstudent, Integer id) {
        Student st = iStudent.findById(id).get();
        st.setName(newstudent.getName());
        st.setAge(newstudent.getAge());
        st.setAddress(newstudent.getAddress());
        st.setBranch(newstudent.getBranch());
        st.setPhoneNumber(newstudent.getPhoneNumber());
        st.setDepartment(newstudent.getDepartment());
        iStudent.save(st);
    }

    public void delete(Integer id) {
        iStudent.findById(id);
    }
}
