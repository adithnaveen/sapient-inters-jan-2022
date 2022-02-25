package com.naveen.auth.server.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naveen.auth.server.entity.User;


public interface UserRepository extends MongoRepository<User, Integer> {
	public Optional<User> findByEmail(String email); 
}
