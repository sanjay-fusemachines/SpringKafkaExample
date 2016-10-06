package com.fusemachines.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fusemachines.Status;
import com.fusemachines.Vote;
import com.fusemachines.kafka.MyKafkaProducer;

@RestController
public class MyKafkaController {
	
	@Autowired
	MyKafkaProducer myKafkaProducer;
	
	@RequestMapping("/vote")
	public Status vote(@RequestBody Vote vote) throws ExecutionException, InterruptedException{
		myKafkaProducer.send(vote.getName());
		
		return new Status("not ok");
	}
	
}
