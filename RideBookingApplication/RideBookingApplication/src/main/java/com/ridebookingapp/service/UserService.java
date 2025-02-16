package com.ridebookingapp.service;

import com.ridebookingapp.model.UserDto;



public interface UserService{

	
		
	com.ridebookingapp.model.User save(UserDto userdto);

	boolean updateUser(Long id, UserDto userDto);

	boolean deleteUser(Long id);

	
	
	
	
	
	
	}


