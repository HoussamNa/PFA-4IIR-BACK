package com.pfa.quickLinker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.User;
import com.pfa.quickLinker.repository.ProfileRepository;
import com.pfa.quickLinker.repository.UserRepository;
=======
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.repository.ProfileRepository;
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0


@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	ProfileRepository profileRepository;
<<<<<<< HEAD
	
	@Autowired
	UserRepository userRepository;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0

	@Override
	public Profile add(Profile profile) {
		// TODO Auto-generated method stub
		return profileRepository.save(profile);
	}

	@Override
	public void deleteById(Long idProfile) {
		// TODO Auto-generated method stub
		profileRepository.deleteById(idProfile);
		
	}

	@Override
	public Profile findById(Long id) {
		// TODO Auto-generated method stub
		return profileRepository.findById(id).get();
	}

	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		return profileRepository.findAll();
	}

	@Override
	public List<Profile> findByName(String name) {
		// TODO Auto-generated method stub
		return profileRepository.findByNomProfile(name);
	}

	@Override
	public List<Profile> findByNameContains(String c) {
		// TODO Auto-generated method stub
		return profileRepository.findByNomProfileContains(c);
	}
<<<<<<< HEAD

=======
// profile tel
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	@Override
	public List<Profile> findByTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
	@Override
	public List<Profile> getProfilesByUser(long idUser) {
		// TODO Auto-generated method stub

		User a = userRepository.findById(idUser).get();
		
		return a.getProfiles();
	}


=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
}
