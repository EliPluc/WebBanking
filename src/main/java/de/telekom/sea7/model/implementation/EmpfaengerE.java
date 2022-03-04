package de.telekom.sea7.model.implementation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpfaengerE {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="empfaenger")
	private String empfaenger;
	
	public EmpfaengerE() {
	}
	
	public EmpfaengerE (String empfaenger) { 	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIban() {
		return empfaenger;
	}

	public void setIban(String empfaenger) {
		this.empfaenger = empfaenger;
	}
	
} //Class - die schließende Klammer der public class EmpfaengerE

