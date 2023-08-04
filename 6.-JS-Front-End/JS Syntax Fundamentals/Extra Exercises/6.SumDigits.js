function sumDigits (number) {
  
    const numberString = number.toString();

    let sum = 0;

    for(let i = 0; i < numberString.length; i++) {
        const digit = parseInt(numberString[i], 10);
        sum += digit;
    }

    console.log(sum);
}

sumDigits(245678);
sumDigits(543);