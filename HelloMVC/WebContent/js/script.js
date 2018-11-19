console.log("hola")

if(document.getElementById('Btncrearhab'))document.getElementById("Btncrearhab").onclick = function(evnt) {
	evnt.preventDefault();

	window.location.href = "./newroom";

	}


if(document.getElementById('BtnVolver'))document.getElementById('BtnVolver').onclick = function(){
	window.history.back();
	}

$('#enviarBtn').click(function(e){
	e.preventDefault();
	console.log("Validando!!");
	
	document.querySelectorAll('.error').forEach(elem => {
		elem.classList.add('esconder');
	});

	if(document.getElementById("nuevousuarioform").checkValidity()){
		return true;
	}

	else{ if(!document.getElementById("email").checkValidity()){
		document.getElementById("emailerr").classList.remove("esconder")
			}
		
		if (!document.getElementById("password").checkValidity()){
			document.getElementById("passworderr").classList.remove("esconder")
			}
	}
	
})

//function validatePassword() {
//    var password = document.getElementById('password')
//        , confirm_password = document.getElementById('conf_password');
//
//    if (password.value != confirm_password.value) {
//        return false;
//    } else {
//        return true;
//    }
//}
//
//function validateEmail() {
//    var email = document.getElementById('email')
//        , confirm_email = document.getElementById('conf_email');
//
//    if (email.value != confirm_email.value) {
//        return false;
//    } else {
//        return true;
//    }
//}