document.getElementById("senden").addEventListener("click",post);
function post (){
	var input ={
		empfaenger: document.getElementById("empf").value,
		iban: document.getElementById("iban").value,
		bic: document.getElementById("bic").value,
		betrag: document.getElementById("betr").value,
		waehrung: document.getElementById("waehr").value,
		verwendungszweck: document.getElementById("verwend").value,
		
	}
	var json =JSON.stringify(input);
	fetch("/zahlung/",
	{
		headers:{"Content-Type":"application/json"},
		method:"POST",
		body:json
		}
	).then(alert("Vielen Dank, Ihr Eintrag war erfolgreich"))
		}
	

