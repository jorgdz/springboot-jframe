package com.github.com.jorgdz.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.com.jorgdz.app.entity.Person;
import com.github.com.jorgdz.app.service.PersonService;
import com.github.com.jorgdz.app.views.Index;

@Component
public class PersonController {
	
	@Autowired
	private Index index;
	
	@Autowired
	private PersonService personService;
	
	public Index getIndex()
	{
		List<Person> persons = personService.findAll();
		
		persons.forEach(p -> {
			System.out.println(p);
		});
		
		return this.index; 
	}
	
}
