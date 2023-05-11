package com.pfa.quickLinker.service;

import java.util.List;

import com.pfa.quickLinker.model.Tel;

public interface TelService {

	Tel add(Tel tel);
	void deleteById(Long id);
	Tel findById(Long id);
	Tel update(Tel tel);
	List<Tel>findAll();
	void addTelToProfile(Long id,Tel tel);
	void addTelToProfile(Long idP,Long idT);
<<<<<<< HEAD
	Tel findByProfile(Long idP);
=======
>>>>>>> cfd5ca8a4a2873bcc45b507f3c7c6515318376c0


}
