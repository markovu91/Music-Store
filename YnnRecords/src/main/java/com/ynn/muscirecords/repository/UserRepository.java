package com.ynn.muscirecords.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.Role;
import com.ynn.muscirecords.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByRole(Role role);
	User findByUsername(String username);

}
