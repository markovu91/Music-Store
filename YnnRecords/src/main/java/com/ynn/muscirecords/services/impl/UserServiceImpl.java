package com.ynn.muscirecords.services.impl;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Role;
import com.ynn.muscirecords.model.User;
import com.ynn.muscirecords.repository.UserRepository;
import com.ynn.muscirecords.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 User user = userRepository.findByUsername(username);
	        
	        if(user == null) throw new UsernameNotFoundException("Korisničko ime ne postoji");
	        
	        HashSet<GrantedAuthority> roles = new HashSet<>();
	        
	        Role role = user.getRole();
	        if(role != null){
	            roles.add(new SimpleGrantedAuthority(role.getRoleName()));
	        }
	        
	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),roles);
	}

	@Override
	public User findByUserName(String username) {
		
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> getByRolee(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public void deleteUser(Integer id) {
		if(id != null) {
			userRepository.deleteById(id);
		}
		
	}

	@Override
	public User getCurrentlyLoggedInUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
