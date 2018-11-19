package com.universales.lab4marvel.controller;


import com.universales.lab4marvel.service.DcVsMarvelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HeroeController {

	@Autowired DcVsMarvelService sentenceService;
	
	
	@RequestMapping("/dcvsmarvel")
	public @ResponseBody String getSentence() {
		long start = System.currentTimeMillis();
		String output = 
			"<h3>Lista de Heroes</h3><br/>" +	  
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>"
			;
		long end = System.currentTimeMillis();
		return output + "Elapsed time (ms): " + (end - start);
	}

}


