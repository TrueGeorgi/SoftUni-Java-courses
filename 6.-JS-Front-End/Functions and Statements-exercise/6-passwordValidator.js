function passwordValidator(input) {
  let errors = false;

  if (input.length < 6 || input.length > 10) {
    errors = true;

    console.log("Password must be between 6 and 10 characters");
  }

  if (!/^[a-zA-Z0-9]+$/.test(input)) {
    errors = true

    console.log("Password must consist only of letters and digits");
  }

  if (!/^(.*?\d){2,}.*$/.test(input)) {
    errors = true

    console.log("Password must have at least 2 digits");
  }

  if(!errors) {
    console.log( "Password is valid");
  }
}