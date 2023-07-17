function numbersCheck (number) {
    let numberString = number.toString();
    let sum = parseInt(numberString[0], 10);
    let isSingleNumber = true;
    let constantNumber = parseInt(numberString[0], 10);

    for (i = 1; i < numberString.length; i++) {
        const currentNum = parseInt(numberString[i], 10);
        sum += currentNum;
        if (currentNum !== constantNumber) {
            isSingleNumber = false;
        }
    }

    console.log(isSingleNumber);
    console.log(sum);
}

numbersCheck(10);
numbersCheck(2222222);
numbersCheck(1234);