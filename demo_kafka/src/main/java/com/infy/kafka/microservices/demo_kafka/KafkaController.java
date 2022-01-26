package com.infy.kafka.microservices.demo_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	KafkaProducer service;
	
	@GetMapping("/getmessage")
	public String sendMessage(@RequestParam String message) {
		service.send(message);
		return "Message sent successfully";
	}

}
