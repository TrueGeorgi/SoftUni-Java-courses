function calculate(...nums) {

  let sum = (num1, num2) => {
    return num1 + num2;
  }

  let subtract = (num1, num2) => {
    return num1 - num2;
  }

  console.log(subtract(sum(nums[0], nums[1]), nums[2]));
}


calculate(23, 6, 10);
calculate(1, 17, 30);
calculate(42, 58, 100);