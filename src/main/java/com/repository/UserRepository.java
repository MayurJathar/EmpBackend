package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUsername(String username); 
	//it help in registration:to avoid duplicate username
    //It helps in login to check is user enter valid username
}
