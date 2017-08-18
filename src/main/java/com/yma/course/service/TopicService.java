package com.yma.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yma.course.dao.TopicDAO;
import com.yma.course.model.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicDAO topicDAO;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicDAO.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicDAO.findOne(id);
	}

	public void addTopic(List<Topic> topics) {
		// topics.add(topic);
		topics.forEach(topic -> topicDAO.save(topic));		
	}

	public void updateTopic(Topic topic, String id) {
		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i, topic); return; } }
		 */
		topicDAO.save(topic);
	}

	public void deteleTopic(String id) {
		// topics.removeIf(t -> t.getId().equals(id));
		topicDAO.delete(id);
	}

}
