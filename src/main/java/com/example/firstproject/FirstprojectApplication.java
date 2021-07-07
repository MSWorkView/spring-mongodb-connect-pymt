package com.example.firstproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstprojectApplication {

	 
	public static void main(String[] args) {
	
		SpringApplication.run(FirstprojectApplication.class, args);
	}


}
