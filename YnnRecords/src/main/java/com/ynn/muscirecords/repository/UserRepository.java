package com.ynn.muscirecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ynn.muscirecords.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
