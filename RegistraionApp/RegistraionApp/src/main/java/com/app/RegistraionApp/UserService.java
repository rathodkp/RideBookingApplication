package com.app.RegistraionApp;
//import com.app.RegistraionApp.payload.response.LoginMesage;



public interface UserService {

	 String addUser(UserDTO userdto) ;
		
	
	LoginMessage loginUser(LoginDTO logindto);
		
	
	
}
