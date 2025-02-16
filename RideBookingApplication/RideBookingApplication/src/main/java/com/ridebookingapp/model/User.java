package com.ridebookingapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;

@Entity
//@EqualsAndHashCode
@Table(name= "users" , uniqueConstraints = @UniqueConstraint(columnNames = "email") )
public class User {
	
	@Id
	@SequenceGenerator(name="user_sequence", sequenceName = "user_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
	private Long id;
	
	@Column(unique = true , nullable = false)
	private String email;
	private String password;
	
	@Enumerated(EnumType.STRING)  //Ensures role is stored as STRING, not TINYINT
	@Column(name="role" , nullable = false)
	private UserRole role;
	
	@Column(name="full_name")
	private String fullName;
	
	
	public User() {
		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserRole getRole() {
		return role;
	}


	public void setRole(UserRole userRole) {
		this.role = userRole;
	}


	

	public User(Long id, String email, String password, UserRole role, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullName = fullName;
	}	
	
}
	

	
		
	