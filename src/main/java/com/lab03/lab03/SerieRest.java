package com.lab03.lab03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieRest {
	
	@RequestMapping(value="/teste", method=RequestMethod.GET)
	public String teste(){
		return "comedia";
	}
}
