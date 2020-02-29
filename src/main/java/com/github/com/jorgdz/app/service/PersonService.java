package com.github.com.jorgdz.app.service;

import java.util.List;

import com.github.com.jorgdz.app.entity.Person;

public interface PersonService {
	
	List<Person> findAll ();
	
	Person findOne(Long id);
	
}
