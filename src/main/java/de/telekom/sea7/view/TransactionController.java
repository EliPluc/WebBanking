package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.ZahlungenImpl;
import de.telekom.sea7.Implementation.ZahlungImplService;


@RestController
public class TransactionController {

@Autowired
	ZahlungenImpl zahlungen;

@PostMapping("/zahlung/")
public void addZahlung(@RequestBody ZahlungImplService zahlung) {
	zahlungen.add(zahlung);
}

}
