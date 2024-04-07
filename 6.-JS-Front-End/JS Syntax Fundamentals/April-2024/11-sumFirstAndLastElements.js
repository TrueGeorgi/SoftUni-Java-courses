function printsFirstAndLast(numsArr) {
  let firstEl = numsArr[0];
  let lastEl = numsArr[numsArr.length - 1];

  console.log(firstEl + lastEl);
}

printsFirstAndLast([3,5,6,1,3,4]);