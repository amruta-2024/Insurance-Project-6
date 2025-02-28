package com.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserDetails(Integer id) {
		Optional<User> optionalUser=userRepository.findById(id);
		
		User user=null;
		if(optionalUser.isPresent()) {
			user=optionalUser.get();
		}
		
		return user;
	}


	

		
	}

