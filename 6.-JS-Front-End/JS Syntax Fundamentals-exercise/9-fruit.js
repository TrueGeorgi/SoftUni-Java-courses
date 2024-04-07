function calculateFruit(fruit, weightInGrams, pricePerKG) {
  weightInKG = weightInGrams / 1000;
  totalPrice = weightInKG * pricePerKG;

  console.log(`I need $${totalPrice.toFixed(2)} to buy ${weightInKG.toFixed(2)} kilograms ${fruit}.`);
}