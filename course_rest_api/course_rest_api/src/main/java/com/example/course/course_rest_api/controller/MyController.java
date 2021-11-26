package com.example.course.course_rest_api.controller;

import com.example.course.course_rest_api.entites.Course;
import com.example.course.course_rest_api.services.CourseServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    CourseServicesImpl cs;

    //Get all the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){

        return cs.getCourses();
    }

    // Get one course by id
    @GetMapping("/courses/{courseid}")
    public  Course getCourse(@PathVariable String courseid){
        return  cs.getCourse(Long.parseLong(courseid));
    }

    //add one course using json Request Body
    @PostMapping("/courses")
    public  Course addCourse(@RequestBody Course course){
        return cs.addCourse(course);
    }

    //update the course by id
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return cs.updateCourse(course);
    }

}
