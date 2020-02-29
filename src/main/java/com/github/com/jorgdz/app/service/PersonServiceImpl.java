package com.github.com.jorgdz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.com.jorgdz.app.entity.Person;
import com.github.com.jorgdz.app.repository.PersonRepo;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Override
	public List<Person> findAll() {
		return personRepo.findAll();
	}

	@Override
	public Person findOne(Long id) {
		return personRepo.findById(id).orElse(null);
	}

}
