package com.example.course.course_rest_api.services;

import com.example.course.course_rest_api.entites.Course;
import com.example.course.course_rest_api.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CourseServicesImpl {
//    List<Course> l1;
@Autowired
private CourseDao cd;


    public List<Course> getCourses(){

        return  cd.findAll()  ;
    }

    public Course getCourse(long courseid) {
        return cd.findById(courseid).orElse(null);

    }

    public Course addCourse(Course course) {
        cd.save(course);
        return  course;
    }

    public Course updateCourse(Course course) {

        cd.save(course);
        return course;
    }
}
