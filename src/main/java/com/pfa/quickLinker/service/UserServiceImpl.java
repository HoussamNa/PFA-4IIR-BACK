package com.pfa.quickLinker.service;

<<<<<<< HEAD
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
=======
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD

=======
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import com.pfa.quickLinker.repository.RoleRepository;
import com.pfa.quickLinker.repository.UserRepository;


@Transactional
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserRepository userRepository;
	 
	@Autowired
	RoleRepository roleRepository;
	
<<<<<<< HEAD
	@Autowired
	ProfileRepository profileRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
=======
<<<<<<< HEAD
	/*
	  @Autowired
	 
	BCryptPasswordEncoder bCryptPasswordEncoder;
	*/
=======
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Role r=roleRepository.findByRole("USER");
		user.getRoles().add(r);
=======
<<<<<<< HEAD
		//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
=======
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
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

<<<<<<< HEAD
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

=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
}
