function validateForm () {
    let myemail = document.forms[0].email.value;
    let pass = document.forms[0].password.value;
    let conpassword = document.forms[0].confirmpassword.value;

    var email = /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/;

    if (myemail.length > 6 && pass.length>6 && conpassword.length>6 && email.test(myemail) && pass===conpassword) {
        document.forms[0].mybutton.disabled = false;
    } else {
        document.forms[0].mybutton.disabled = true;
    }
}

function validateEmail () {
    var email = /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/;
    let myemail = document.forms[0].email.value;
    if (myemail.length > 6 && email.test(myemail)) {
        document.forms[0].email.style = "border:1px solid #ced4da";
    } else {
        document.forms[0].email.style = "border:2px solid red";
    }
}   

function validatePassword () {
    let pass = document.forms[0].password.value;
    if (pass.length>6) {
        document.forms[0].password.style = "border:1px solid #ced4da";
    } else {
        document.forms[0].password.style = "border:2px solid red";
    }
}

function validateConfPass () {
    let conpassword = document.forms[0].confirmpassword.value;
    if (conpassword.length>6) {
        document.forms[0].confirmpassword.style = "border:1px solid #ced4da";
    } else {
        document.forms[0].confirmpassword.style = "border:2px solid red";
    }
}

function changePassView (passwordInput, passStatus) {

    if (passwordInput.type == 'password'){
        passwordInput.type='text';
        passStatus.className='fa fa-eye-slash eye-icon';
        
      }
      else{
        passwordInput.type='password';
        passStatus.className='fa fa-eye eye-icon';
      }
}
function onConfPassEyeClick() {
    let confPasswordInput = document.getElementById("confirm-password");
    let confPassIcon = document.getElementsByClassName("eye-icon")[1];
    changePassView(confPasswordInput, confPassIcon);
}