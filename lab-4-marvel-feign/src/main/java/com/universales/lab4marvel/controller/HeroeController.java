package com.universales.lab4marvel.controller;


import com.universales.lab4marvel.service.DcVsMarvelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HeroeController {

	@Autowired DcVsMarvelService sentenceService;
	
	
	/**
	 * Display a small list of Sentences to the caller:
	 */
	@RequestMapping("/dcvsmarvel")
	public @ResponseBody String getSentence() {
	  return 
		"<h3>Lista de Heroes</h3><br/>" +	  
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>";
	}

}


