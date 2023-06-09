package com.pfa.quickLinker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.quickLinker.model.Adresse;
import com.pfa.quickLinker.model.Image;
<<<<<<< HEAD
import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.repository.ProfileRepository;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
import com.pfa.quickLinker.service.AdresseService;
import com.pfa.quickLinker.service.ImageService;


@RestController
@RequestMapping("/adresse")
@CrossOrigin("*")
public class AdresseController {

	@Autowired
	AdresseService adresseService;
	@Autowired
	ImageService imageService;
	
<<<<<<< HEAD
	@Autowired
	ProfileRepository profileRepository;
	
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	/*
	 	
	Adresse add(Adresse adresse);
	void deleteById(Long id);
	Adresse findById(Long id);
	List<Adresse>findAll();
	Adresse update(Adresse adresse);
	void addAdresseToProfile(Long idProfile,Adresse adresse);
	 */
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	
=======
	//maping 
>>>>>>> 826bd14b7b4cff0eeca6378020a16da86f0e5a07
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	@PostMapping("/add")
	public Adresse addAdresse(@RequestBody Adresse adresse) {
		
		return adresseService.addAdresse(adresse);
	}
	
	@DeleteMapping("/delete/{idAdresse}")
	public void deleteById(@PathVariable Long idAdresse) {
		adresseService.deleteById(idAdresse);
	}
	
	
	@GetMapping("/{id}")
	public Adresse findById(@PathVariable Long id) {
		return adresseService.findById(id);
	}
	
	@GetMapping("/all")
	public List<Adresse>findAll(){
		return adresseService.findAll();
	}
	
	@PostMapping("/update")
	public Adresse update(@RequestBody Adresse adresse) {
		return adresseService.update(adresse);
	}
	
	@PostMapping("/addAdresseToProfile/{idProfile}")
	public void addAdresseToProfile(@PathVariable Long idProfile,@RequestBody Adresse adresse) {
		adresseService.addAdresseToProfile(idProfile, adresse);
	}
	
<<<<<<< HEAD
	
	@PostMapping("/addAdresseToProfile/{idP}/{idA}")
	public void addAdresseToProfile(@PathVariable Long idA,@PathVariable Long idP) {
		
		Profile p=profileRepository.findById(idP).get();
		p.setAdresse(adresseService.findById(idA));
		profileRepository.save(p);
	}
	
	@GetMapping("/findByProfile/{idP}")
	public Adresse findByProfile(@PathVariable Long idP) {
		return adresseService.findByProfile(idP);
	}
	
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
}
