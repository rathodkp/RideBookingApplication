package com.ridebookingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ridebookingapp.model.UserDto;
import com.ridebookingapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	
	 @GetMapping("/registration")
	    public String getRegistrationPage(Model model) {
	        model.addAttribute("user", new UserDto());
	        return "register"; // returns Thymeleaf/JSP view
	    }

	 @PostMapping("/registration")
	    public ResponseEntity<String> saveUser(@RequestBody UserDto userDto) {
	        userservice.save(userDto);
	        return ResponseEntity.ok("Register Successfully!");
	    }
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<String> updateUser(
	            @PathVariable Long id, 
	            @RequestBody UserDto userDto) {
	        
	        boolean updated = userservice.updateUser(id, userDto);
	        if (updated) {
	            return ResponseEntity.ok("User updated successfully.");
	        } else {
	            return ResponseEntity.badRequest().body("User update failed.");
	        }
	 }
	 @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
	        boolean deleted = userservice.deleteUser(id);
	        
	        if (deleted) {
	            return ResponseEntity.ok("User deleted successfully.");
	        } else {
	            return ResponseEntity.badRequest().body("User not found.");
	        }
}
}
