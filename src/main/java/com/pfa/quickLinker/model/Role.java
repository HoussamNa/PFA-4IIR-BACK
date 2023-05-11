package com.pfa.quickLinker.model;

<<<<<<< HEAD
import com.pfa.quickLinker.controller.ProfileController;
import com.pfa.quickLinker.service.ProfileService;

=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
=======
import lombok.AllArgsConstructor;
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
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	private String role;
	
<<<<<<< HEAD
	
	
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
}
