package com.pfa.quickLinker.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
<<<<<<< HEAD
import com.pfa.quickLinker.controller.ProfileController;
import com.pfa.quickLinker.service.ProfileService;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Builder;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
<<<<<<< HEAD
@Builder
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
public class Profile {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfile;
	
	private String nomProfile;
	private String descProfile;
	private List<String>urls;
	@ManyToOne
	@JoinColumn(name = "idAdresse")
	@JsonIgnore
	private Adresse adresse;
	
	
	@ManyToOne
<<<<<<< HEAD
	@JsonIgnore
	private User user;
	
	
	@ManyToOne
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	@JoinColumn(name = "idTel")
	@JsonIgnore
	private Tel tel;
	

	


}
