package com.pfa.quickLinker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.repository.ProfileRepository;
<<<<<<< HEAD
import com.pfa.quickLinker.service.ProfileService;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0


@RestController
@RequestMapping("/profile")
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
<<<<<<< HEAD
	ProfileService profileService;
=======
	ProfileRepository profileRepository;
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	
	/*
	  		Profile add(Profile profile);
			void deleteById(Long idProfile);
			Profile findById(Long id);
			List<Profile>findAll();	
			List<Profile> findByName(String name);
			List<Profile>findByNameContains(String c);
			//jpql
			List<Profile>findByTel(String tel);
			
	 */
	
	@PostMapping("/add")
	public Profile add(@RequestBody Profile profile) {
<<<<<<< HEAD
		return profileService.add(profile);
=======
		return profileRepository.save(profile);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	@GetMapping("/all")
	public List<Profile>findAll(){
<<<<<<< HEAD
		return profileService.findAll();
=======
		return profileRepository.findAll();
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	@DeleteMapping("/delete/{idProfile}")
	public void deleteById(@PathVariable Long idProfile) {
<<<<<<< HEAD
		profileService.deleteById(idProfile);
=======
		profileRepository.deleteById(idProfile);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
		
	}
	
	@GetMapping("/{idProfile}")
	public Profile findById(@PathVariable Long idProfile) {
<<<<<<< HEAD
		return profileService.findById(idProfile);
=======
		return profileRepository.findById(idProfile).get();
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	@GetMapping("/name/{name}")
	public List<Profile>findByName(@PathVariable("name") String name){
<<<<<<< HEAD
		return profileService.findByName(name);
	}
	
	@GetMapping("/ProfilesByUser/{idUser}")
	public List<Profile>getProfilesByUser(@PathVariable long idUser){
		return profileService.getProfilesByUser(idUser);
=======
		return profileRepository.findByNomProfile(name);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}

}
