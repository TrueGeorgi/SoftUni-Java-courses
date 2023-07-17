function fruitPrice (fruit, grams, pricePerKG) {
    const fruitKG = grams / 1000;
    const price = fruitKG * pricePerKG;

    console.log(`I need $${price.toFixed(2) } to buy ${fruitKG.toFixed(2)} kilograms ${fruit}.`)
}

fruitPrice('orange', 2500, 1.80);