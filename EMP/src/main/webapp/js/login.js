function validateForm() {
	let id = document.forms[0].id.value;
	let pass = document.forms[0].password.value;

	if (id && pass) {
		document.forms[0].mybutton.disabled = false;
	} else {
		document.forms[0].mybutton.disabled = true;
	}
}

function onPassEyeClick() {
	let passwordInput = document.getElementById("password");
	let passIcon = document.getElementsByClassName("eye-icon")[0];
	changePassView(passwordInput, passIcon);
}

function changePassView(passwordInput, passStatus) {

	if (passwordInput.type == 'password') {
		passwordInput.type = 'text';
		passStatus.className = 'fa fa-eye-slash eye-icon';

	} else {
		passwordInput.type = 'password';
		passStatus.className = 'fa fa-eye eye-icon';
	}
}
