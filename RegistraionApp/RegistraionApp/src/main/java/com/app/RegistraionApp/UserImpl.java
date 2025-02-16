package com.app.RegistraionApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.RegistraionApp.model.User;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class UserImpl implements UserService{

	@Autowired
	private UserRepo userrepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	public String addUser(UserDTO userdto) {
		User user =new User(
		userdto.getUserid(),
		userdto.getUsername(),
		userdto.getEmail(),
		
		this.passwordEncoder.encode(userdto.getPassword()));
		
		userrepo.save(user);
		return user.getUsername();
	}
	UserDTO userdto;
	@Override
	public LoginMessage loginUser(LoginDTO logindto) {
		String msg = " ";
		User user1=
				userrepo.findByEmail(LoginDTO.getEmail());
		
		 if (user1 != null) {
	            String password = logindto.getPassword();
	            String encodedPassword = user1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
		
		   if(user1.isPresent()) {
			   return new LoginMessage("Login Success " , true);
		   }
		   //else {
			  // return new LoginMessage("Login failed", false);
			   
		   //} 
		 else {
			   return new LoginMessage("password Not Match", false);
           }
       }else {
           return new LoginMessage("Email not exits", false);
       }
		   }
}
