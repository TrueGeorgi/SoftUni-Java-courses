function sumInput(num1, num2) {
  let sum = 0;
  outputArr = [];

  for (let index = num1; index <= num2; index++) {
    sum += index;
    outputArr.push(index)
  }

  console.log(outputArr.join(' '));
  console.log(`Sum: ${sum}`);
}