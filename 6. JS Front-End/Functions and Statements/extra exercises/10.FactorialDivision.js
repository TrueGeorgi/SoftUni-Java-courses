function factorialDividedByTwo(number1, number2) {
  function returnFactorial(number, startNumber, result) {
    if (startNumber === number) {
      result *= startNumber;
      return result;
    } else {
      result *= startNumber;
      startNumber += 1;
      return returnFactorial(number, startNumber, result);
    }
  }
  let firstFactorial = returnFactorial(number1, 1, 1);
  let secondFactorial = returnFactorial(number2, 1, 1);
  let result = firstFactorial / secondFactorial;
  console.log(result.toFixed(2));
}

factorialDividedByTwo(2, 2);
factorialDividedByTwo(5, 2);
factorialDividedByTwo(6, 2);
