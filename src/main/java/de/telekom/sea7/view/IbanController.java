package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.model.implementation.IbanE;
import de.telekom.sea7.model.implementation.IbanRepository;

@RestController
public class IbanController {

	@Autowired
	IbanRepository ibanrepository;

	@GetMapping("/ibanDB")
	public IbanE getIbanE(@RequestParam(required = false) Long id) {

		Optional<IbanE> ibanE = ibanrepository.findById(id);

		if (ibanE.isPresent()) {

			return ibanE.get();
		}
		return null;

	}
}