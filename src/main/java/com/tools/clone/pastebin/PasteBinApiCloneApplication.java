package com.tools.clone.pastebin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PasteBinApiCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasteBinApiCloneApplication.class, args);
	}

}
