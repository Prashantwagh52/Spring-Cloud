package com.prashant.springcloud.controller;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.springcloud.Service.UserServies;
import com.prashant.springcloud.entity.User;

@RestController
@RequestMapping("/users")
public class UserController implements Serializable {

	private static final long serialVersionUID = 6862358626887845112L;

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserServies userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		logger.info("Get Single User Handler: UserController");
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

}
