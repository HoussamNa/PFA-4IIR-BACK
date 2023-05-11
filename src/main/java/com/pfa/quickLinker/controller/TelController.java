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

import com.pfa.quickLinker.model.Profile;
import com.pfa.quickLinker.model.Tel;
import com.pfa.quickLinker.repository.ProfileRepository;
import com.pfa.quickLinker.repository.TelRepository;
<<<<<<< HEAD
import com.pfa.quickLinker.service.ProfileService;
import com.pfa.quickLinker.service.TelService;
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0

@RestController
@RequestMapping("/tel")
@CrossOrigin("*")
public class TelController {

	@Autowired
<<<<<<< HEAD
	TelService telService;
	
	@Autowired
	ProfileService profileService;
=======
	TelRepository telRepository;
	
	@Autowired
	ProfileRepository profileRepository;
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	/*
	Tel add(Tel tel);
	void deleteById(Long id);
	Tel findById(Long id);
	Tel update(Tel tel);
	List<Tel>findAll();
	void addTelToProfile(Long id,Tel tel);

	 */
	
	@PostMapping("/add")
	public Tel add(@RequestBody Tel tel) {
<<<<<<< HEAD
		return telService.add(tel);
=======
		return telRepository.save(tel);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
		
	}
	
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable Long id) {
<<<<<<< HEAD
		telService.deleteById(id);
=======
		telRepository.deleteById(id);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	
	@GetMapping("/{id}")
	public Tel findById(@PathVariable Long id) {
<<<<<<< HEAD
		return telService.findById(id);
=======
		return telRepository.findById(id).get();
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	@PutMapping("/update")
	public Tel updateTel(@RequestBody Tel tel) {
<<<<<<< HEAD
		return telService.update(tel);
=======
		return telRepository.save(tel);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	@GetMapping("/all")
	public List<Tel>findAll(){
<<<<<<< HEAD
		return telService.findAll();
=======
		return telRepository.findAll();
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	
	@PostMapping("/addTelToProfile/{id}")
	public void addTelToProfile(@RequestBody Tel tel,@PathVariable Long id) {
		
<<<<<<< HEAD
		Profile p=profileService.findById(id);
		p.setTel(tel);
		telService.add(tel);
		profileService.add(p);
=======
		Profile p=profileRepository.findById(id).get();
		p.setTel(tel);
		telRepository.save(tel);
		profileRepository.save(p);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
	@PostMapping("/addTelToProfile/{idP}/{idT}")
	public void addTelToProfile(@PathVariable Long idT,@PathVariable Long idP) {
		
<<<<<<< HEAD
		Profile p=profileService.findById(idP);
		p.setTel(telService.findById(idT));
		profileService.add(p);
	}
	
	@GetMapping("/findByProfile/{idP}")
	public Tel findByProfile(@PathVariable Long idP) {
		
		return telService.findByProfile(idP);
		
=======
		Profile p=profileRepository.findById(idP).get();
		p.setTel(telRepository.findById(idT).get());
		profileRepository.save(p);
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0
	}
}
