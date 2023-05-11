package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole(Role role);
	User addRoleToUser(String username,String roleName);
	List<User>findAllUsers();
	User AddUserToProfile(long idUser,long idProfile);

}
