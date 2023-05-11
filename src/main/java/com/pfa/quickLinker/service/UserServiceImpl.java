package com.pfa.quickLinker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Image;
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
import com.pfa.quickLinker.repository.ProfileRepository;
import com.pfa.quickLinker.repository.RoleRepository;
import com.pfa.quickLinker.repository.UserRepository;


@Transactional
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserRepository userRepository;
	 
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	ProfileRepository profileRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Role r=roleRepository.findByRole("USER");
		user.getRoles().add(r);
		return userRepository.save(user);
	}

	@Override
	public User findUserByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public User addRoleToUser(String username, String roleName) {
		User u=userRepository.findByUsername(username);
		Role r=roleRepository.findByRole(roleName);
		
		u.getRoles().add(r);
		userRepository.save(u);
		return u;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	
	@Override
	public User AddUserToProfile(long idUser,long idProfile) {
		// TODO Auto-generated method stub
		
		
		 
				
		
		
		User u = userRepository.findById(idUser).get();
		Profile p=profileRepository.findById(idProfile).get();
		p.setUser(u);
		profileRepository.save(p);
		return  u;
		
		
		
		
		
		
		
		
		
		
	}

}
