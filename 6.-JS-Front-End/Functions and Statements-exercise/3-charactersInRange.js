function printChars(char1, char2) {
  num1 = char1.charCodeAt(0);
  num2 = char2.charCodeAt(0);

  if (num1 >= num2) {
    print(num2, num1);
  } else {
    print(num1, num2);
  }

  function print(firstNumber, secondNumber) {
    toPrintArr = [];
    for (let i = firstNumber + 1; i < secondNumber; i++) {
      toPrintArr.push(String.fromCharCode(i));
    }

    console.log(toPrintArr.join(" "));
  }
}



printChars('a', 'd');
printChars('#', ':');
printChars('C', '#');
