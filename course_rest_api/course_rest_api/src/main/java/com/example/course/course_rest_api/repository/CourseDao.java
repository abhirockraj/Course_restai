package com.example.course.course_rest_api.repository;

import com.example.course.course_rest_api.entites.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CourseDao extends JpaRepository<Course,Long> {

}
