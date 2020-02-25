package com.infosys.spring.git.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBootGitDemoApplication {

	public static void main(String[] args) {
		System.out.println("*** Inside SpringBootGitDemoApplication ***");
		addData(Constants.DATA_TYPE);
		SpringApplication.run(SpringBootGitDemoApplication.class, args);
		
	}
	
	public void addedMethod() {
		System.out.println("New method added");
	}
	
	public static void addData(String data) {
		System.out.println("data= "+ data);
	}

}
