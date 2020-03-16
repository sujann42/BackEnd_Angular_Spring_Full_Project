package com.crud.Angular_Spring_Full_Project;

import com.crud.Angular_Spring_Full_Project.dao.UserRepository;
import com.crud.Angular_Spring_Full_Project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class AngularSpringFullProjectApplication {

	@Autowired
	private UserRepository userRepository;

	//Post a user
	@PostMapping("/register")
	public String postUser(@RequestBody User user) {
		userRepository.save(user);
		return "Hi, " + user.getName() + " registration has been created!!!";
	}

	//Get All Users
	@GetMapping("/getAllUsers")
	public List<User> getALlUsers() {
		return userRepository.findAll();
	}

	/*//Get user by email
	public List<User> getUserByEmail(@PathVariable String email){
		return userRepository.findByEmail(email);
	}*/

	//Delete an user and load all users
	@DeleteMapping("/cancel/{id}")
	public List<User> deleteUserById(@PathVariable int iid) {
		userRepository.deleteById(String.valueOf(iid));
		return userRepository.findAll();
	}
	//Update an user [Find and update]

	public static void main(String[] args) {

		SpringApplication.run(AngularSpringFullProjectApplication.class, args);
	}

}
