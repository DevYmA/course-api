package com.yma.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yma.course.datatransbean.CourseTopics;
import com.yma.course.model.Course;

import com.yma.course.service.CourseService;
import com.yma.course.service.TopicService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@Autowired
	private TopicService topicService;

	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		//courseService.getAllCourses();
		return courseService.getAllCourses();
	}

	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void saveCourse(@RequestBody CourseTopics courseTopics) {
		courseService.saveCourse(courseTopics.getCourse());
		courseTopics.getTopics().forEach(topic -> topic.setCourse(courseTopics.getCourse()));
		topicService.addTopic(courseTopics.getTopics());
	}

	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}

	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

}
