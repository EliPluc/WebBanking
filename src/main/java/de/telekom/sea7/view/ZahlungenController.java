package de.telekom.sea7.view;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import de.telekom.sea7.model.implementation.ZahlungE;
import de.telekom.sea7.model.implementation.ZahlungenRepository;

@Controller
public class ZahlungenController {

	@Autowired
	ZahlungenRepository zahlungen;

	@GetMapping("/zahlungenDB")
	@ResponseBody
	public List<ZahlungE> getAll(){
		List<ZahlungE> zahlungsliste = zahlungen.findAll();
		return zahlungsliste;
	}
	
	@GetMapping("/zahlungDB/{id}")
	@ResponseBody
	public Optional<ZahlungE> getZahlungE(@PathVariable(name = "id")Long id) {

		Optional<ZahlungE> zahlung = zahlungen.findById(id);

		if (zahlung.isPresent()) {

			return zahlung;
					}
		else { 
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
	}
}
