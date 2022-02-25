package de.telekom.sea7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankPropertySettingsConfiguation {

	
	@Value("${de.telekom.sea7.bankname}")
	private String bankname; //Telekom-Bank

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
	
	// <T>
	// ?
	// *
	// % 
}
