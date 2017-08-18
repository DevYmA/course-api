package com.yma.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yma.course.dao.CourseDAO;
import com.yma.course.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> getAllCourses(){
		List<Course> coursesList = new ArrayList<>();
		courseDAO.findAll().forEach(coursesList::add);
		coursesList.forEach(course -> System.out.println(course.getCourseName()+" "+course.getTopics().size()));
		return coursesList;
	}
	
	public Course getCourse(String id) {
		return courseDAO.findOne(id);
	}
	
	public void saveCourse(Course course) {
		courseDAO.save(course);
	}
	
	public void updateCourse(Course course) {
		courseDAO.save(course);
	}
	
	public void deleteCourse(String id) {
		courseDAO.delete(id);
	}
}
