package com.universales.lab4marvel.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.universales.lab4marvel.model.Heroe;

@FeignClient("DC")
public interface DcClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Heroe getHeroe();
	
}