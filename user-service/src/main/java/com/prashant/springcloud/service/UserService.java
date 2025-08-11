package com.prashant.springcloud.service;

import java.util.List;

import com.prashant.springcloud.entity.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getAllUser();

	public User getUser(String userId);

}
