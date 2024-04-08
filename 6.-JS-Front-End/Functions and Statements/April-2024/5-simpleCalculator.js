let solver = (num1, num2, operator) => {
  switch(operator) {
    case 'multiply': return num1 * num2;
    break;
    case 'divide': return num1 / num2;
    break;
    case 'add': return num1 + num2;
    break;
    case 'subtract': return num1 - num2;
    break;
  }
}


console.log(solver(1,5,'multiply'));