package de.telekom.sea7;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.telekom.sea7.Implementation.ZahlungImplService;
import de.telekom.sea7.Interfaces.ZahlungImpl;

@Controller
public class ViewImpl {

//  Instanziierung von class ZahlungImplServe 
	// mit Testdaten Constructor über @Autowired
	@Autowired
	ZahlungImplService zahlung;
	@Autowired
	ZahlungImplService zahlung1;
	@Autowired
	ZahlungImplService zahlung2;
	@Autowired
	ZahlungenImpl zahlungen;

	@GetMapping("zahlung.json")  //https://localhost.8080/zahlung.json
	@ResponseBody
	public String getJson() {
	String empfaenger =	zahlung.getEmpfaenger();
	String empfaengerIBAN = zahlung.getIban();
	String empfaengerBIC = zahlung.getBic();
	double betrag = zahlung.getBetrag();
	String waehrung = zahlung.getWaehrung();
	String verwendungszweck = zahlung.getVerwendungszweck();
		
		
		return "{"
	             +" 'zahlung': {"
	             +" 'empfaenger': "      + empfaenger + ","
	             +" 'iban': "            + "'"+empfaengerIBAN+"'" + ","
	             +" 'bic': "             + "'"+empfaengerBIC+"'" + ","
	             +" 'betrag':"           + betrag + ","
	             +" 'waehrung':"         + waehrung + ","
	             +" 'verwendungszweck':" + verwendungszweck +","
	             +"},"
	             +"}";
		
}
	@GetMapping("/zahlungen.json")
	@ResponseBody
	public String getZahlungen() {
		zahlungen.add(zahlung);  //für Bsp Daten eingefügt
		zahlungen.add(zahlung1);
		zahlungen.add(zahlung2);

		String ergebnis = "{";
		/**for (ZahlungImpl tempZahlung:zahlungen) {
			
			
			das ist die verkürzte Form für den Iterator
			
		}*/

		Iterator<ZahlungImplService> tempZahlungIterator = zahlungen.iterator();
		int id = 1;
		while (tempZahlungIterator.hasNext()) {
			ZahlungImplService tempZahlung = tempZahlungIterator.next();
			String empfaenger = tempZahlung.getEmpfaenger();
			String iban = tempZahlung.getIban();
			String bic = tempZahlung.getBic();
			Double betrag = tempZahlung.getBetrag();
			String waehrung = tempZahlung.getWaehrung();
			String verwendungszweck = tempZahlung.getVerwendungszweck();
			String tempIteration = 
				"\""+ id +"\":{" 
				+ " \"Empfaenger\": " + "\""+ empfaenger + "\"," 
				+ " \"Iban\": " + "\"" + iban + "\","
				+ " \"Bic\": " + "\"" + bic + "\","
				+ " \"Betrag\": " + "\"" + betrag + "\"," 
				+ " \"Waehrung\": " + "\""+ waehrung + "\","
				+ " \"Verwendungszweck\": " + "\"" + verwendungszweck + "\"" 
				+ " }";
			ergebnis = ergebnis + tempIteration;	
			if (id <= zahlungen.size()-1) {
				ergebnis = ergebnis + ",";
			}
			id++;
	}
		ergebnis = ergebnis + "}";
		return ergebnis;
	}
}

