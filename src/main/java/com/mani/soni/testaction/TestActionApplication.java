package com.mani.soni.testaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestActionApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Logger logger = LoggerFactory.getLogger(TestActionApplication.class);
		logger.info("Java App Started!!!");
	}

}
