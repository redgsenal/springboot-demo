package com.springboot.sample.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	private static final Logger logInfo = LoggerFactory.getLogger(SpringbootDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
		logInfo.info("SpringBoot Demo here...");
	}
}
