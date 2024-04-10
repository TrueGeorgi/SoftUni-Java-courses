function oddAndEvenSum(num) {
  let sumOdd = 0;
  let sumEven = 0;

  let singleNum = num % 10;

  while (num > 0) {
    num = Math.floor(num / 10);
    singleNum % 2 === 0 ? sumEven += singleNum : sumOdd += singleNum;

    singleNum = num % 10;
    
  }

  console.log(`Odd sum = ${sumOdd}, Even sum = ${sumEven}`);
}



oddAndEvenSum(3495892137259234);