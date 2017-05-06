package com.sarindy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DnynnOAuth2Application implements CommandLineRunner {

	

	public static void main(String[] args) {
		SpringApplication.run(DnynnOAuth2Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	}

}
