package com.lab03.lab03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieRest {
	
	@Autowired
	private SerieDAO dao;
	
	@RequestMapping(value="/addSerie", method=RequestMethod.POST)
	public Serie postUsuario(@RequestBody Serie serie){
		return dao.persisteSerie(serie);
	}
}
