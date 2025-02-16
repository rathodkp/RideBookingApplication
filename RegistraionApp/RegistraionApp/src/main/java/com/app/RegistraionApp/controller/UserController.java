package com.app.RegistraionApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.RegistraionApp.LoginDTO;
import com.app.RegistraionApp.LoginMessage;
import com.app.RegistraionApp.UserDTO;
import com.app.RegistraionApp.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping(path="/save")
	public String saveUser(@RequestBody UserDTO userdto) {
		String id= userservice.addUser(userdto);
		return id;
		
	}
	@PostMapping(path ="/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO  logindto){
		
		LoginMessage loginResponse = userservice.loginUser(logindto);
        return ResponseEntity.ok(loginResponse);
    }
		
	}

	
	
	

