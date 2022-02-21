package com.dev.padraoCamadas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.padraoCamadas.dto.UserDto;
import com.dev.padraoCamadas.entities.User;
import com.dev.padraoCamadas.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	// buscar pelo id
	@Transactional(readOnly = true)
	public UserDto findById(Long id) {
		User entity = repository.findById(id).get();
		UserDto dto = new UserDto(entity);
		return dto;
	}

	

}
