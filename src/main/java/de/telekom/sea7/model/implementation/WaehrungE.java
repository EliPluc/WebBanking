package de.telekom.sea7.model.implementation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WaehrungE {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="waehrung")
	private String waehrung;
	
	public WaehrungE() {
	}
	
	public WaehrungE (String waehrung) { 	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIban() {
		return waehrung;
	}

	public void setIban(String waehrung) {
		this.waehrung = waehrung;
	}
	
} //Class - die schließende Klammer der public class EmpfaengerE

