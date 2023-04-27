package com.pfa.quickLinker.service;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD

=======
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
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
	/*
	  @Autowired
	 
	BCryptPasswordEncoder bCryptPasswordEncoder;
	*/
=======
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
=======
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
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

}
