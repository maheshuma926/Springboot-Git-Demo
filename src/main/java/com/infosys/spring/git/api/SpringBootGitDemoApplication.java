package com.infosys.spring.git.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitDemoApplication {

	public static void main(String[] args) {
		System.out.println("*** Inside SpringBootGitDemoApplication ***");
		addData(Constants.DATA_TYPE);
		SpringApplication.run(SpringBootGitDemoApplication.class, args);

	}

	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@PathVariable String userName, @PathVariable double amount,
			@PathVariable String productName) {
		return "Hi "+ userName + " Order for "+ productName + " with amount " + amount + " stored successfully";

	}

	public static void addData(String data) {
		System.out.println("data= " + data);
	}

}
