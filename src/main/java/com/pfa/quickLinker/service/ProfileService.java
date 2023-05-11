package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Tel;

public interface ProfileService {
	
			Profile add(Profile profile);
			void deleteById(Long idProfile);
			Profile findById(Long id);
			List<Profile>findAll();	
			List<Profile> findByName(String name);
			List<Profile>findByNameContains(String c);
<<<<<<< HEAD
			//jpql	
			List<Profile>findByTel(String tel);
			List<Profile>getProfilesByUser(long idUser);
			
			
=======
			//jpql
			List<Profile>findByTel(String tel);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
			
			
			
}
