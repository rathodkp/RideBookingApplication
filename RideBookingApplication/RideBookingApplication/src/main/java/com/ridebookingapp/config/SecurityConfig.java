	package com.ridebookingapp.config;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
	import org.springframework.security.crypto.password.PasswordEncoder;

	@Configuration
	public class SecurityConfig {
		
		

		@Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder(); // ✅ Use BCrypt for password hashing
	    }
	}

		
		
		
		
		
	

		
		 /* @Bean
		    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		        http
		            .csrf(csrf -> csrf.disable())  // Disable CSRF for testing (Not recommended for production)
		            .authorizeHttpRequests(auth -> auth
		                .requestMatchers("/api/registration").permitAll() // Allow registration
		                .anyRequest().authenticated()
		            )
		            .httpBasic(withDefaults()); // Enable Basic Auth

		        return http.build();
		    }

	    private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefaults() {
			// TODO Auto-generated method stub
			return null;
		}  */

	

