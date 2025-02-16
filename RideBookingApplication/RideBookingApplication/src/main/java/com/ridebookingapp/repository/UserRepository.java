package com.ridebookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ridebookingapp.model.User; // ✅ Correct import

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}





/*package com.ridebookingapp.repository;

import java.util.Optional;

//import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	 Optional<User> findByEmail(String email);

	com.ridebookingapp.model.User save(com.ridebookingapp.model.User user); 

} */
