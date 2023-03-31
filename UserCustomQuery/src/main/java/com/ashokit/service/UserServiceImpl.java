package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.repo.UserRepositary;

@Service
public class UserServiceImpl {
	@Autowired
	private UserRepositary repo;
	

}
