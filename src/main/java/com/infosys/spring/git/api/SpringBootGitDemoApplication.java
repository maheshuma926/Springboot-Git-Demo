package com.infosys.spring.git.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBootGitDemoApplication {

	public static void main(String[] args) {
		System.out.println("*** Inside SpringBootGitDemoApplication ***");
		addData("Spring Git Demo");
		SpringApplication.run(SpringBootGitDemoApplication.class, args);
		
	}
	
	public static void addData(String data) {
		System.out.println("data= "+ data);
	}

}
