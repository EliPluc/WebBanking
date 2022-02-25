package de.telekom.sea7;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import de.telekom.sea7.Implementation.ZahlungImplService;
import de.telekom.sea7.Interfaces.ZahlungImpl;

@Service
public class ZahlungenImpl implements Iterable <ZahlungImplService>{

	private ArrayList<ZahlungImplService> paymentsList = new ArrayList<>();

	public void add(ZahlungImplService zahlung) {
		paymentsList.add(zahlung);
	}

	public int size() {
		return paymentsList.size();
	}

	public Iterator<ZahlungImplService> iterator() {	
	return paymentsList.iterator();
	}

	public ZahlungImplService get(int position)throws Exception {
	if (paymentsList.size()<= position && paymentsList.size()>=0) {
		return paymentsList.get(position);	
	}else {
	throw new Exception();
	}

}
	public int getId(ZahlungImpl zahlung) {
		return paymentsList.lastIndexOf(zahlung);
	}
}