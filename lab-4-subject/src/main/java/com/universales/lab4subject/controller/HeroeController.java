package com.universales.lab4subject.controller;


import com.universales.lab4subject.model.Heroe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeroeController {

	@Value("${heroes}") String heroes;

	
	@RequestMapping("/")
	public @ResponseBody Heroe getHeroe() {
		String[] heroeArray = heroes.split(",");
		int i = (int)Math.round(Math.random() * (heroeArray.length - 1));
		return new Heroe(heroeArray[i]);
	}
}


