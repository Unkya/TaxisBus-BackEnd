package com.nawak.taxisBus.bean.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable{

	private static final long serialVersionUID = 3089240195025661733L;

	@Id @GeneratedValue
	private Long id;
	
	private String email;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String password) {
		setEmail(email);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
