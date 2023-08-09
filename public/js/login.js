function validateRegistration(){
  let password = document.forms["register"]["password"].value;
  let verifyPassword = document.forms["register"]["verify_password"].value;
  let email = document.forms["register"]["email"].value;

  if (password !== verifyPassword){
    alert("Passwords do not match.");
    return false;
  }

  if (password.length < 8){
    alert("Password is too short");
    return false;
  }

  return true;
}

document.addEventListener('DOMContentLoaded', function() {
  document.onsubmit = validateRegistration;
});
