package com.ridebookingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ridebookingapp.model.User;
import com.ridebookingapp.model.UserDto;
import com.ridebookingapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder; // For hashing passwords

    @Override
    public User save(UserDto userDto) { // Correct return type
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword())); // Encrypt password
        user.setRole(userDto.getRole()); // Assign role correctly
        ((User) user).setFullName((String) userDto.getFullName()); // Ensure fullName is a String

        return userRepository.save(user);
    }

	@Override
	public boolean updateUser(Long id, UserDto userDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
