package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SampleApplication.class, args);
		System.out.println("Hello world");
		Gym g= context.getBean(Gym.class);
		g.Gyming();
		Gym g1= context.getBean(Gym.class);
		g1.Gyming();
	}

}
