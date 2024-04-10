function factorial(numOne, numTwo) {

  function findFactorial(num) {
    if (num <= 0) {
      return 1;
    } else {
      return findFactorial(num - 1) * num;
    }
  }

console.log((findFactorial(numOne) / findFactorial(numTwo)).toFixed(2));
}

factorial(5, 2);