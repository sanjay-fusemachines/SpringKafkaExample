package com.fusemachines.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fusemachines.kafka.MyKafkaProducer;

@Configuration
public class AppBeans {
	
	@Bean
	public MyKafkaProducer initProducer(){
		return new MyKafkaProducer();
	}
	
}
