package com.universales.lab4marvel;

import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class Lab4MarvelApplication {

	@Autowired
    @Lazy
	private EurekaClient eurekaClient;
	
 
	public static void main(String[] args) {
		SpringApplication.run(Lab4MarvelApplication.class, args);
	}
}
