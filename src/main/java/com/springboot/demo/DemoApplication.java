package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication		// @SpringBootApplication: It marks the root class of a Spring Boot application
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Person person = context.getBean(Person.class);
		person.show();

//		Person person1 = context.getBean(Person.class);
//		person1.show();
	}

}
