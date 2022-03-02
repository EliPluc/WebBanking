document.getElementById("senden").addEventListener("click",post);
document.getElementById("reset").addEventListener("click",reset);
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
		
		
		function reset(){
			
	
		document.getElementById("empf").value ="";
		document.getElementById("iban").value ="";
		document.getElementById("bic").value ="";
		document.getElementById("betr").value ="";
		document.getElementById("waehr").value ="";
		document.getElementById("verwend").value ="";
		
	}
	

	

