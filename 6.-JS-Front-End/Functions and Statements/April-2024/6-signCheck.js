function negivesCheck(...nums) {
  let minuses = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] < 0) {
      minuses++;
    }
  }

  if (minuses === 0 || minuses % 2 === 0) {
    console.log('Positive');
  } else {
    console.log('Negative');
  } 
}