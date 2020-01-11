package com.accommodation.service;

import java.util.List;

import com.accommodation.model.User;
import com.accommodation.repository.UserRepository;

public class UserService implements Service<User> {

	private UserRepository userRepository=new UserRepository();
	
	@Override
	public User save(User entity) {
		// TODO Auto-generated method stub
		return userRepository.save(entity);
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public boolean delete(User entity) {
		// TODO Auto-generated method stub
		return userRepository.delete(entity);
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.deleteById(id);
	}
	public User findByCredentials(String username, String password) {
		return userRepository.findByCredentials(username, password);
	}
	public User findByUserName(String username) {
		return userRepository.findByUserName(username);
	}

}
