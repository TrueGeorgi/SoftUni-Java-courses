function smallest(...nums) {
  let min = Number.MAX_VALUE;
  nums.forEach(num => {
    if(num < min) {
      min = num;
    }
  })

  console.log(min);
}


smallest(2, 5, 3);
smallest(600, 342, 123);
smallest(25, 21, 4);
smallest(2, 2 , 2);
