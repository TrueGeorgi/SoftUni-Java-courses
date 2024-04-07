function sumDigits(num) {
  let sum = 0;
  let digit;
  while (num != 0) {
    digit = num % 10;
    num = Math.floor(num / 10);
    sum += digit;
  }

  console.log(sum);
}

sumDigits(12412);