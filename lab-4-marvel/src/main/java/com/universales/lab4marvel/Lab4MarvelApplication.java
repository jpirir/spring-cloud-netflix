package com.universales.lab4marvel;

import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Lab4MarvelApplication {

	@Autowired
    @Lazy
	private EurekaClient eurekaClient;
	
	 //  This "LoadBalanced" RestTemplate 
	//  is automatically hooked into Ribbon:
	@Bean @LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	} 
 
	public static void main(String[] args) {
		SpringApplication.run(Lab4MarvelApplication.class, args);
	}
}
