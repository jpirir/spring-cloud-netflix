package com.universales.lab4marvel.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import com.universales.lab4marvel.dao.*;
import com.universales.lab4marvel.model.*;

@Service
public class HeroeServiceImpl implements HeroeService {

	@Autowired DcClient dcClient;

	@Autowired MarvelClient marvelClient;

	@HystrixCommand(fallbackMethod="getFallbackDc")
	public Heroe getDc() {
		return dcClient.getHeroe();
	}
	

	
	public Heroe getFallbackDc() {
		return new Heroe("Pepe");
	}
	
	public Heroe getFallbackMarvel() {
		return new Heroe("Paco");
	}



	@HystrixCommand(fallbackMethod="getFallbackMarvel")
	public Heroe getMarvel() {
		return marvelClient.getHeroe();
	}

	
	
	

}