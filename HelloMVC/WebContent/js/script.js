console.log("hola")

document.getElementById("Btncrearhab").onclick = function(evnt) {
	evnt.preventDefault();

	window.location.href = "./newroom";

}


document.getElementById('BtnVolver').onclick = function(){
	window.history.back();
}


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