function largestNumber (num1, num2, num3) {
  largestNumberInt = num1;
  numsArray = [num2, num3];
  numsArray.forEach(element => {
    if (element > largestNumberInt) {
      largestNumberInt = element
    }
  });
  return `The largest number is ${largestNumberInt}.`
}

console.log(largestNumber(5, -3, 16));