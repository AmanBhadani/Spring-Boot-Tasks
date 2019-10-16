package com.stackroute.muzixapp;

import com.stackroute.muzixapp.startup.ApplicationListen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ApplicationListen.class)
@SpringBootApplication
public class MuzixApp {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApp.class, args);
	}

}
