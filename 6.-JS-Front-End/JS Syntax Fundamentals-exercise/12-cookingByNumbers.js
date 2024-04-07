function cookingByNumbers(number, ...operations) {
  for (let index = 0; index < 5; index++) {
    if (operations[index] === "chop") {
      number /= 2;
    } else if (operations[index] === "dice") {
      number = Math.sqrt(number);
    } else if (operations[index] === "spice") {
      number += 1;
    } else if (operations[index] === "bake") {
      number *= 3;
    } else if (operations[index] === "fillet") {
      number = (number * 0.8).toFixed(1);
    }
    console.log(number);
  }
  console.log();
  console.log('New Row');
  console.log();
}

cookingByNumbers("32", "chop", "chop", "chop", "chop", "chop");
cookingByNumbers("9", "dice", "spice", "chop", "bake", "fillet");
