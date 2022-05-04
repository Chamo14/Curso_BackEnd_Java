package com.chamorroandresbackend.app.service;

import java.util.Optional;


import com.chamorroandresbackend.app.entity.User;

public interface UserService {

		public Iterable<User> findAll();
		public Optional<User> findById(Long id);
		public User save(User user);
		public void deleteById(Long id);
}
