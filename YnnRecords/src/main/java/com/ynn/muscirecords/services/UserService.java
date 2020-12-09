package com.ynn.muscirecords.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ynn.muscirecords.model.Role;
import com.ynn.muscirecords.model.User;


public interface UserService extends UserDetailsService {

	User findByUserName(String username);

	List<User> getByRolee(Role role);

}
