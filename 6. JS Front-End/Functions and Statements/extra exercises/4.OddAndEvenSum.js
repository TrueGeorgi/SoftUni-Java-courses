function oddAndEven (number) {
    let oddSum = 0;
    let evenSum = 0;

    while (number !== 0) {

        let digit = number % 10;

        if(digit % 2 === 0) {
            evenSum += digit;
        } else {
            oddSum += digit;
        }

        number /= 10;
        number = Math.floor(number);
    }

    console.log(`Odd sum = ${oddSum}, Even sum = ${evenSum}`)
}

oddAndEven(3495892137259234);