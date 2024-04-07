function evenVsOdd(numsArr) {
  let even = 0;
  let odd = 0;

  numsArr.forEach(num => {
    if (num % 2 == 0) {
      even += num
    } else {
      odd += num
    }
  })

  console.log(even - odd);
}


evenVsOdd([1,2,3,4,5,6]);
evenVsOdd([3,5,7,9] );
evenVsOdd([2,4,6,8,10]);