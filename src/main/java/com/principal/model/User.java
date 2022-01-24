package com.principal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Users")
public class User extends Base{


	@Column(name="Name")
    private String name;
	@Column(name="LastName")
    private String lastName;
	@Column(name="SurName")
    private String surName;
	@Column(name="Email")
    private String email;
	@Column(name="Role")
    private String role;
	@Column(name="UserName")
    private String username;
	@Column(name="Password")
    private String password;
	@Column(name="Status")
    private String status;
	
	
	
	@Column(name="Usermodifier")
    private String userModifier;
	@Column(name="UserCreator")
    private String userCreator;
	
	public User(String name, String lastName, String surName, String email, String role, String username,
			String password, String status, String userModifier, String userCreator) {
		 this.name = name;
		 this.lastName = lastName;
		 this.surName = surName;
		 this.email = email;
		 this.role = role;
		 this.username = username;
		 this.password = password;
		 this.status = status;
		 this.userModifier = userModifier;
		 this.userCreator = userCreator;
	}
	public User() {
	}
	
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserModifier() {
		return userModifier;
	}
	public void setUserModifier(String userModifier) {
		this.userModifier = userModifier;
	}
	public String getUserCreator() {
		return userCreator;
	}
	public void setUserCreator(String userCreator) {
		this.userCreator = userCreator;
	}
	
		
}
