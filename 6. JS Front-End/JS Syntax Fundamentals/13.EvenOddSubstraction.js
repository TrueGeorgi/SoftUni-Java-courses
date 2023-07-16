function differenceOddEven (inputArray) {
    let sumEven = 0;
    let sumOdd = 0;

    for (let i = 0; i < inputArray.length; i++) {
        if (inputArray[i] % 2 === 0) {
            sumEven += inputArray[i];
        } else {
            sumOdd += inputArray[i];
        }
    }

    let result = sumEven - sumOdd;
    console.log(result);
}

differenceOddEven([1,2,3,4,5,6]);