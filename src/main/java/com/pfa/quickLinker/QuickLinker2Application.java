package com.pfa.quickLinker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
<<<<<<< HEAD

=======
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0

import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
import com.pfa.quickLinker.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
<<<<<<< HEAD
@EnableWebSecurity
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
public class QuickLinker2Application {

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(QuickLinker2Application.class, args);
	}

	/* @PostConstruct
	void init_users() {
		//Ajouter les roles
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		
		// Ajouter les users
		userService.saveUser(new User(null,"admin","123",true,null));
		userService.saveUser(new User(null,"ELkastali","123",true,null));
		userService.saveUser(new User(null,"Otmane","123",true,null));
		
		//ajouter les roles aux users
		
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		
		
		userService.addRoleToUser("ELkastali", "ADMIN");
		userService.addRoleToUser("otmane", "USER");
		
		
		
	}
*/
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
	/*@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
*/	
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
	
<<<<<<< HEAD
=======
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
}
