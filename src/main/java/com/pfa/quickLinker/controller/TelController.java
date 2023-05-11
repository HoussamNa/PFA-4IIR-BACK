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
import com.pfa.quickLinker.service.ProfileService;
import com.pfa.quickLinker.service.TelService;

@RestController
@RequestMapping("/tel")
@CrossOrigin("*")
public class TelController {

	@Autowired
	TelService telService;
	
	@Autowired
	ProfileService profileService;
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
		return telService.add(tel);
		
	}
	
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable Long id) {
		telService.deleteById(id);
	}
	
	
	@GetMapping("/{id}")
	public Tel findById(@PathVariable Long id) {
		return telService.findById(id);
	}
	
	@PutMapping("/update")
	public Tel updateTel(@RequestBody Tel tel) {
		return telService.update(tel);
	}
	
	@GetMapping("/all")
	public List<Tel>findAll(){
		return telService.findAll();
	}
	
	@PostMapping("/addTelToProfile/{id}")
	public void addTelToProfile(@RequestBody Tel tel,@PathVariable Long id) {
		
		Profile p=profileService.findById(id);
		p.setTel(tel);
		telService.add(tel);
		profileService.add(p);
	}
	@PostMapping("/addTelToProfile/{idP}/{idT}")
	public void addTelToProfile(@PathVariable Long idT,@PathVariable Long idP) {
		
		Profile p=profileService.findById(idP);
		p.setTel(telService.findById(idT));
		profileService.add(p);
	}
	
	@GetMapping("/findByProfile/{idP}")
	public Tel findByProfile(@PathVariable Long idP) {
		
		return telService.findByProfile(idP);
		
	}
}
