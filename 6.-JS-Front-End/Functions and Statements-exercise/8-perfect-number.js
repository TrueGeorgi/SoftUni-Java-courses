function checkPerfection(num) {
  let outputString = "It's not so perfect.";
  let properDivisors = [];
  let numToBeManipulated = num;

  if (num % 2 !== 0) {
    console.log(outputString);
    return;
  }

  while(numToBeManipulated !== 1) {
    numToBeManipulated = Math.ceil(numToBeManipulated / 2);
    properDivisors.push(numToBeManipulated);
  }

  let sum = 0;

  for (let i = 0; i < properDivisors.length; i++) {
    sum += properDivisors[i];
  }

  if(sum === num) {
    outputString = "We have a perfect number!";
  }

  console.log(outputString);
}


checkPerfection(28);
checkPerfection(1);