package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import de.telekom.sea7.model.implementation.ZahlungE;
import de.telekom.sea7.model.implementation.ZahlungenRepository;



@Controller
public class ZahlungenController {
	
@Autowired
ZahlungenRepository zahlungen;

@GetMapping("/zahlungenDB")
public String getZahlungE(Model model,

				
                        
@RequestParam(required = false) Long id) {


    ZahlungE zahlung = new ZahlungE();

    if (id != null) {

        Optional<ZahlungE> ZahlungE = zahlungen.findById(id);

        if (ZahlungE.isPresent()) {

            zahlung = ZahlungE.get();

        }

    }

    model.addAttribute("zahlung", zahlung);


    return "zahlung";

}
}
