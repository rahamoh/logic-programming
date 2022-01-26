package com.infy.kafka.microservices.demo_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	@Autowired
	KafkaTemplate<String, String> template;
	
	String topic = "kafka_topic2";
	
	public void send(String message) {
		template.send(topic, message);
	}

}
