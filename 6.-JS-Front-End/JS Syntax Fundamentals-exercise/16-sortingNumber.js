function sort(numsArr) {
  midSize = Math.ceil(numsArr.length / 2);
  numsArr.sort((a, b) => a - b);

  lowestNums = numsArr.slice(0,5);
  highestNums = numsArr.slice(5, numsArr.length);
  highestNums.reverse();

  outputArr = [];

  for (let i = 0; i < midSize; i++) {
    outputArr.push(Number(lowestNums.splice(0, 1)));
    
    if (highestNums.length !== 0) {
      outputArr.push(Number(highestNums.splice(0, 1)));
    }
  }

  console.log(outputArr);
}

sort([1, 65, 3, 52, 48, 63, 31, -3, 18, 56] );