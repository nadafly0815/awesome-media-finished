package com.skcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AwesomeMediaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeMediaConfigServerApplication.class, args);
	}
}