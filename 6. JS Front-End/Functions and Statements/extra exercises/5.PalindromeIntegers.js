function palindrome(number) {
  for (let i = 0; i < number.length; i++) {
    const digits = String(number[i]).split("").map(Number);
    let isPalindrome = true;
    for (let j = 0; j < Math.floor(digits.length / 2); j++) {
      if (digits[j] !== digits[digits.length - 1 - j]) {
        isPalindrome = false;
        continue;
      }
    }
    console.log(isPalindrome);
  }
}

palindrome([32, 2, 232, 1010]);
