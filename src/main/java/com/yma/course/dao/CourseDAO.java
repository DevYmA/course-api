package com.yma.course.dao;

import org.springframework.data.repository.CrudRepository;

import com.yma.course.model.Course;

public interface CourseDAO extends CrudRepository<Course, String>{

}
