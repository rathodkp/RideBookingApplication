package com.ridebookingapp.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

import com.ridebookingapp.model.UserRole; // ✅ Correct import


public class UserDto implements UserDetails {

    private Long id;
    private String email;
    private String password;
    private UserRole role;
    private String fullName;

    public UserDto() {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public UserRole getRole() { return role; }
    public void setRole(UserRole role) { this.role = role; }

   
    @Override
    public String toString() {
        return "UserDto [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + ", fullName="
                + fullName + "]";
    }

    // Spring Security UserDetails Methods
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + role.name()));
    }


    @Override
    public String getUsername() { return email; }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }

	public Object getFullName() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
