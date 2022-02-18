package com.naveen.rest.works;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.naveen.rest.works.beans.User;
import com.naveen.rest.works.repo.UserRepository;
import com.naveen.rest.works.service.UserService;

@SpringBootTest
class UserServiceTest {

	@Autowired
	private UserService service; 

	@MockBean
	private UserRepository repo;
	
	@BeforeEach
	public void setUp() {
		Optional<User> user = Optional.of(new User(101, "Naveen", 1234, "naveen@probits.in"));
		List<User> list = Arrays.asList(new User(101, "Naveen", 1234, "naveen@probits.in"));
		
		// mocked object 
		when(repo.findById(101)).thenReturn(user); 
		when(repo.findAll()).thenReturn(list); 
		when(repo.save(user.get())).thenReturn(user.get()); 
		when(repo.insert(user.get())).thenReturn(user.get()); 
	}
	
	
	@Test
	@DisplayName("When user id is given return valid object")
	public void whenUserIdIsGivenThenReturnObjectIfExists() {
		assertEquals(101, service.getUserById(101).get().getId());
	}
	
	@Test
	@DisplayName("get all the users and list should give you an array of 1 user")
	public void getAllUsers() {
		assertEquals(1, service.getAllUsers().size());
	}
	
	
	@Test
	@DisplayName("save the valid user and acknowledge the same")
	public void saveUserToTheServer() {
		User user = new User(101, "Naveen", 1234, "naveen@probits.in");
//		assertEquals(101, service.saveUser(user).getId());
		 User user2 = service.saveUser(user);
		 assertNotNull(user2);
		 System.out.println("User2 -> " + user2);
	}
	
	
	
	
	
	
	
}
