package com.example.HibernateMappingAssignment.service;

import com.example.HibernateMappingAssignment.dao.ICourse;
import com.example.HibernateMappingAssignment.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private ICourse iCourse;

    public void addCourse(Course course) {
         iCourse.save(course);
    }

    public Course getbyId(Integer id) {
        return iCourse.findById(id).get();
    }

    public void update(Course newCourse, Integer id) {
        Course co = iCourse.findById(id).get();
        co.setTitle(newCourse.getTitle());
        co.setDuration(newCourse.getDuration());
        co.setDescription(newCourse.getDescription());
        iCourse.save(co);
    }

    public void delete(Integer id) {
        iCourse.deleteById(id);
    }

    public List<Course> getallCourse() {
        return iCourse.findAll();
    }
}
