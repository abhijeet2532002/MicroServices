package com.example.AbhijeetServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AbhijeetServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbhijeetServiceDiscoveryApplication.class, args);
		System.out.println("\n\t\t ..... Abhijeet service discovery repository .....\n");
	}

}
