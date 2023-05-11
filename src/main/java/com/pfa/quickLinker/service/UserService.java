package com.pfa.quickLinker.service;

<<<<<<< HEAD
import java.util.List;

import com.pfa.quickLinker.model.Profile;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole(Role role);
	User addRoleToUser(String username,String roleName);
<<<<<<< HEAD
	List<User>findAllUsers();
	User AddUserToProfile(long idUser,long idProfile);
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0

}
