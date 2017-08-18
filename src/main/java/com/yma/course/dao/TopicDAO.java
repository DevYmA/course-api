package com.yma.course.dao;

import org.springframework.data.repository.CrudRepository;

import com.yma.course.model.Topic;

public interface TopicDAO extends CrudRepository<Topic, String>{

}
