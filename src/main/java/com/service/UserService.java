package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.UserDTO;
import com.entity.User;
import com.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	public String registration(User user) {
	
		User existinguser=urepo.findByUsername(user.getUsername());
		if(existinguser==null)
		{
			urepo.save(user);
			return "User registration successful";
		}else
		{
			return "User name allready exist.. Please try another username";
		}	
	}
	
	public User login(UserDTO userdto) {
		User existinguser = urepo.findByUsername(userdto.getUsername());
		if(existinguser==null) {
			return null;
		}
		else {
			if(existinguser.getPassword().equals(userdto.getPassword())) {
				return existinguser;
			} else {
				return null;
			}
		}
	}
}
