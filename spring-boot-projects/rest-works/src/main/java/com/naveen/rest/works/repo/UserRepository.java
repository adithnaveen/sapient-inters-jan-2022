package com.naveen.rest.works.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.naveen.rest.works.beans.User;


public interface UserRepository extends MongoRepository<User, Integer> {

	// + if you want customized queries you can write here 
	public List<User> findByName(String name); 
}
