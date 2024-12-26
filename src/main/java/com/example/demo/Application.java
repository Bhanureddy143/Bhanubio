package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.err.println("tomcat-jasper added in pom.xml");
		 System.err.println("Goto Chrome-->localhost:3000 \n Result will be displayed");
		System.err.println("Springboot Application Started");
		System.err.println("Use Imgbb website and upload pic and select dont auto delete then full html code and copy paste in jsp");
		
	}

}
