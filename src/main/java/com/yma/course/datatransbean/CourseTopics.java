package com.yma.course.datatransbean;

import java.util.ArrayList;
import java.util.List;

import com.yma.course.model.Course;
import com.yma.course.model.Topic;

public class CourseTopics {

	private Course course;
	private List<Topic> topics = new ArrayList<>();
	
	public CourseTopics() {
		// TODO Auto-generated constructor stub
	}

	public CourseTopics(Course course, List<Topic> topics) {
		super();
		this.course = course;
		this.topics = topics;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	
}
