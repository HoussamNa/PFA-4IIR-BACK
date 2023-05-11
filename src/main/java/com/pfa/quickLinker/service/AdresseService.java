package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Adresse;

public interface AdresseService {
	
	Adresse addAdresse(Adresse adresse);
	void deleteById(Long id);
	Adresse findById(Long id);
	List<Adresse>findAll();
	Adresse update(Adresse adresse);
	void addAdresseToProfile(Long idProfile,Adresse adresse);
<<<<<<< HEAD
	void addAdresseToProfile(Long idP,Long idA);
	Adresse findByProfile(Long idP);
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0

}
