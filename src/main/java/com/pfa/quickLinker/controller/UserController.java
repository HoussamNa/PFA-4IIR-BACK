package com.pfa.quickLinker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
import com.pfa.quickLinker.repository.RoleRepository;
import com.pfa.quickLinker.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleRepository roleRepository;
	

	
	@GetMapping("/all")
	public List<User>getAllUsers(){
		return userService.findAllUsers();
	}
	
	
	@PostMapping("/addProfileToUser/{idUser}/{idProfile}")
	public User addProfileToUser(@PathVariable("idUser") long idUser,@PathVariable("idProfile") long idProfile) {
		
		return userService.AddUserToProfile(idUser, idProfile);
	}
	
	
	@PostMapping("/add")
	public User saveUser (@RequestBody  User user) {
		// TODO Auto-generated method stub
	
		return userService.saveUser(user);
	}

	@GetMapping("/findByUserame/{username}")
	public User findUserByUsername(@PathVariable String username) {
		
		return userService.findUserByUsername(username);
	}



	@PostMapping("/addRoleToUser/{username}/{roleName}")
	public User addRoleToUser(@PathVariable("username") String username,@PathVariable("roleName") String roleName) {
		User u=userService.findUserByUsername(username);
		Role r=roleRepository.findByRole(roleName);
		
		u.getRoles().add(r);
		userService.saveUser(u);
		return u;
	}


	

		
		
		
		
		
		
		
		
		
		
	

}
