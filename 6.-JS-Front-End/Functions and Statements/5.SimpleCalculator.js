// Example 1 - With arrow function

// const caclulate = (num1, num2, operator) => {
//   let result;

//   switch (operator) {
//     case "multiply":
//         result = num1 * num2;
//       break;
//     case "divide":
//         result = num1 / num2;
//       break;
//     case "add":
//         result = num1 + num2;
//       break;
//     case "subtract":
//         result = num1 - num2;
//       break;
//   }

//   return result;
// }

// console.log (caclulate(5,3,'subtract'))

// Example 2 - No coditional statements

const operations = {
    'multiply': (num1, num2) => num1 * num2,
    'divide': (num1, num2) => num1 / num2,
    'add': (num1, num2) => num1 + num2,
    'subtract': (num1, num2) => num1 - num2,
}

const calculateResult = (num1, num2, operator) => {
  const operation = operations[operator]
  console.log(operation(num1, num2))
}

calculateResult(5, 5, 'multiply')
