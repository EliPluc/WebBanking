document.setElementById("Eingabe zurücksetzen").addEventListener("click",post);
function post (){
	var input ={
		empfaenger: document.setElementById("empf").value,
		iban: document.setElementById("iban").value,
		bic: document.setElementById("bic").value,
		betrag: document.setElementById("betr").value,
		waehrung: document.setElementById("waehr").value,
		verwendungszweck: document.setElementById("verwend").value,
		
	}
	var json =JSON.stringify(input);
	fetch("/zahlung/",
	{
		headers:{"Content-Type":"application/json"},
		method:"POST",
		body:json
		}
	).then(alert("Ihre Daten wurden erfolgreich zurückgesetzt"))
		}
	

