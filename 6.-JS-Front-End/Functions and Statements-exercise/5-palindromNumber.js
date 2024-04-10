function palindromOrNotArr(numsArr) {

  for (let i = 0; i < numsArr.length; i++) {
    palindromOrNot(numsArr[i])
  }

  
  function palindromOrNot(num) {
    if (num === 0) {
      return 'true'
    }

    const arrayOfSingleNums = [];
    fakeNum = num;
    
    while (fakeNum > 0) {
      singleNum = Math.floor(fakeNum % 10);
      arrayOfSingleNums.push(singleNum);
      fakeNum = Math.floor(fakeNum / 10);
    }

    let lenghtOfArray = arrayOfSingleNums.length;

    let firstPart = [];
    let secondPart = [];

    for (let i = 0; i < Math.floor(lenghtOfArray / 2); i++) {
      firstPart.push(arrayOfSingleNums.shift())
    }

    if(firstPart.length !== arrayOfSingleNums.length) {
      secondPart = arrayOfSingleNums.reverse();
      secondPart.pop();
    } else {
      secondPart = arrayOfSingleNums.reverse();
    }

    let same = true;

    for (let i = 0; i < firstPart.length; i++) {
      if (firstPart[i] !== secondPart[i]) {
        same = !same;
      }
    }

    console.log(same);
  }
}

palindromOrNotArr([123,323,421,121]);
