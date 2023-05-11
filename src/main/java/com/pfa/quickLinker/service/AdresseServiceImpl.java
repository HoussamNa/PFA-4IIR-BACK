package com.pfa.quickLinker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.repository.AdresseRepository;
import com.pfa.quickLinker.repository.ProfileRepository;

@Service
public class AdresseServiceImpl implements AdresseService {
	
	@Autowired
	AdresseRepository adresseRepository;
	
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Adresse addAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		return adresseRepository.save(adresse);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		adresseRepository.deleteById(id);
		
	}

	@Override
	public Adresse findById(Long id) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(id).get();
	}

	@Override
	public List<Adresse> findAll() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public Adresse update(Adresse adresse) {
		// TODO Auto-generated method stub
		return adresseRepository.save(adresse);
	}

	@Override
	public void addAdresseToProfile(Long idProfile, Adresse adresse) {
		// TODO Auto-generated method stub
		/*
		return imageRepository.save(Image.builder()
				.name(file.getOriginalFilename())
				.type(file.getContentType())
				.image(file.getBytes())
				.adresse(a).build()); 
		 */
		Profile p=profileRepository.findById(idProfile).get();
		p.setAdresse(adresse);
		profileRepository.save(p);
	
		
	}

<<<<<<< HEAD
	@Override
	public void addAdresseToProfile(Long idP, Long idA) {
		Profile p=profileRepository.findById(idP).get();
		p.setAdresse(adresseRepository.findById(idA).get());
		profileRepository.save(p);
		
	}

	@Override
	public Adresse findByProfile(Long idP) {
		// TODO Auto-generated method stub
		Profile p=profileRepository.findById(idP).get();
		return p.getAdresse();
	}

=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
}
