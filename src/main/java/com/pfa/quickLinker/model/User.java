package com.pfa.quickLinker.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
import jakarta.persistence.OneToMany;
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
	
	private String nom;
	
	private String prenom;
	
	private Date ddn;
	
	private String genre;
	
	private String email;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	private boolean enbaled;
	
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	List<Profile>profiles;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "idUser"),inverseJoinColumns = @JoinColumn(name="idRole"))
	private List<Role>roles;

}
