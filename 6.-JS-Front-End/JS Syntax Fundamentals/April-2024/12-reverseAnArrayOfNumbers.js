function cutAndReverse(num, numsArr) {
  console.log(numsArr.slice(0, num).reverse().join(" "));
}

cutAndReverse(3, [1,2,3,4,5,6,7])