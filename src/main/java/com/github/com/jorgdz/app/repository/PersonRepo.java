package com.github.com.jorgdz.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.com.jorgdz.app.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>{

}