package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.model.implementation.BicE;
import de.telekom.sea7.model.implementation.BicRepository;

@RestController
public class BicController {

	@Autowired
	BicRepository bicrepository;

@GetMapping("/bicDB")
public BicE getBicE(@RequestParam(required = false) Long id){
	
		Optional<BicE> bicE = bicrepository.findById(id);
		
		if (bicE.isPresent()) {

			return bicE.get();
		}
		return null;
	}
}