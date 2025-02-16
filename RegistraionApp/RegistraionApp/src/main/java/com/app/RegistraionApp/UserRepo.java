package com.app.RegistraionApp;

import java.util.Optional;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.RegistraionApp.model.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
	@Query
	Optional<User> findOneByAndPassword(String username, String password);
	
	//@Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    //Optional<User> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
	
	//User findByEmail(String email);

}
