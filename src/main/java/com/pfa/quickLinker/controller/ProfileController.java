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
import com.pfa.quickLinker.service.ProfileService;


@RestController
@RequestMapping("/profile")
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	ProfileService profileService;
	
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
		return profileService.add(profile);
	}
	
	@GetMapping("/all")
	public List<Profile>findAll(){
		return profileService.findAll();
	}
	
	@DeleteMapping("/delete/{idProfile}")
	public void deleteById(@PathVariable Long idProfile) {
		profileService.deleteById(idProfile);
		
	}
	
	@GetMapping("/{idProfile}")
	public Profile findById(@PathVariable Long idProfile) {
		return profileService.findById(idProfile);
	}
	
	@GetMapping("/name/{name}")
	public List<Profile>findByName(@PathVariable("name") String name){
		return profileService.findByName(name);
	}
	
	@GetMapping("/ProfilesByUser/{idUser}")
	public List<Profile>getProfilesByUser(@PathVariable long idUser){
		return profileService.getProfilesByUser(idUser);
	}

}
