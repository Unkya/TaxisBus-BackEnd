package com.nawak.taxisBus.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nawak.taxisBus.bean.user.User;
import com.nawak.taxisBus.bean.user.repository.UserJPARepository;
import com.nawak.taxisBus.services.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	private UserJPARepository userJPARepository;

	public UserServiceImpl(@Autowired UserJPARepository userJPARepository) {
		this.userJPARepository = userJPARepository;
	}
	
	@Override
	public User create(User user) {
		return userJPARepository.save(user);
	}

	@Override
	public void delete(User user) {
		userJPARepository.delete(user);
		return;
	}

	@Override
	public User save(User user) {
		return userJPARepository.save(user);
	}

	@Override
	public List<User> list() {
		return userJPARepository.findAll();
	}

	@Override
	public User get(Long id) {
		return userJPARepository.getOne(id);
	}

	@Override
	public User save(Long id, User user) {
		return save(user);
	}

}
