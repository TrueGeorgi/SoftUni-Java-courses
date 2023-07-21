function passwordChecker(password) {
  isValid = true;
  if (!isValidLength(password)) {
    isValid = false;
  }

  if (!hasValidCharacters(password)) {
    isValid = false;
  }

  if (!hasAtLeast2Digits(password)) {
    isValid = false;
  }

  if (isValid) {
    console.log("Password is valid");
  }

  function isValidLength(password) {
    if (password.length >= 6 && password.length <= 10) {
      return true;
    } else {
      console.log(`Password must be between 6 and 10 characters`);
      return false;
    }
  }

  function hasValidCharacters(password) {
    for (let i = 0; i < password.length; i++) {
      let currentChar = password.charCodeAt(i);
      if (
        !(currentChar >= 65 && currentChar <= 90) &&
        !(currentChar >= 97 && currentChar <= 122) &&
        !(currentChar >= 48 && currentChar <= 57)
      ) {
        console.log("Password must consist only of letters and digits");
        return false;
      }
    }
    return true;
  }

  function hasAtLeast2Digits(password) {
    let digitsAmount = 0;

    for (let i = 0; i < password.length; i++) {
      let currentChar = password.charCodeAt(i);
      if (currentChar >= 48 && currentChar <= 57) {
        digitsAmount++;
      }
    }

    if (digitsAmount >= 2) {
      return true;
    } else {
      console.log("Password must have at least 2 digits");
      return false;
    }
  }
}

//passwordChecker('logIn');
//passwordChecker('MyPass123');
passwordChecker("Pa$s$s");
