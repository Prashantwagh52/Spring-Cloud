package com.prashant.springcloud.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.springcloud.entity.User;
import com.prashant.springcloud.exceptions.ResourceNotFoundException;
import com.prashant.springcloud.repository.UserRepository;
import com.prashant.springcloud.service.UserService;

@Service("userService")
public class UserServicesImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		User user = userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
		return user;
	}

}
