package com.github.com.jorgdz.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "persons")
public class Person implements Serializable {

	private static final long serialVersionUID = 1587545788431910576L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dni", length = 10)
	private String dni;
	
	@Column(name = "name", length = 155)
	private String name;
	
	@Column(name = "lastname", length = 155)
	private String lastname;
	
	@Column(name = "birth_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	public Person(Long id, String dni, String name, String lastname, Date birthDate) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.lastname = lastname;
		this.birthDate = birthDate;
	}
	
	public Person() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", dni=" + dni + ", name=" + name + ", lastname=" + lastname + ", birthDate="
				+ birthDate + "]";
	}

}
