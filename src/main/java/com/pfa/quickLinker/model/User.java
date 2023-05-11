package com.pfa.quickLinker.model;

<<<<<<< HEAD
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

=======
import java.util.List;

>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class User {
	/*
	 * id
	 * nom
	 * prenom
	 * email
	 * username
	 * password
	 * ddn
	 * genre
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	
<<<<<<< HEAD
	private String nom;
	
	private String prenom;
	
	private Date ddn;
	
	private String genre;
	
	private String email;
	
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	@Column(unique = true)
	private String username;
	
	private String password;
	private boolean enbaled;
	
<<<<<<< HEAD
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	List<Profile>profiles;
	
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "idUser"),inverseJoinColumns = @JoinColumn(name="idRole"))
	private List<Role>roles;

}
