package com.pfa.quickLinker.model;

<<<<<<< HEAD
import com.pfa.quickLinker.controller.ProfileController;
import com.pfa.quickLinker.service.ProfileService;

=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Builder;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
<<<<<<< HEAD
@Builder
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
public class Tel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTel;
	private String nomTel;
	@Column(length = 10)
	private String numTel;
	
	
}
