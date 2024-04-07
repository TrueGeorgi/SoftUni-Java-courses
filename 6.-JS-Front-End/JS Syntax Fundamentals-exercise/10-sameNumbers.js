function sameNum(num) {
  let startingNum = num % 10;
  let sum = startingNum;
  let compareNum;
  let equal = true;
  num = Math.floor(num / 10);

  while(num != 0) {
    compareNum = num % 10;
    sum += compareNum;
    num = Math.floor(num / 10);


    if (compareNum !== startingNum) {
      equal = false;
    }
  }

  console.log(equal);
  console.log(sum);
}