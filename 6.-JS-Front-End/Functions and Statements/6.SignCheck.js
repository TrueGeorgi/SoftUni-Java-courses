// Write a function, that checks whether the result of the multiplication numOne * numTwo * numThree is positive
// or negative. Try to do this WITHOUT multiplying the 3 numbers.

function positivOrNegative (num1, num2, num3) {
    const arrayInput = [num1, num2, num3];

    let minuses = 0;

    for (i = 0; i < 3; i++) {
        if(arrayInput[i] < 0) {
            minuses++;
        }
    }

    if (minuses % 2 !== 0) {
        console.log('Negative')
    } else{
        console.log('Positive')
    }
}

positivOrNegative(2,4,5)
positivOrNegative(2,-4,5)
positivOrNegative(2,-4,-5)
positivOrNegative(-2,-4,-5)