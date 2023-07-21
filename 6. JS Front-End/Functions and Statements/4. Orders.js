function calculateOrder(product, amount) {

    let price;

  switch (product) {
    case "coffee":
        price = amount * 1.5;
      break;
    case "water":
        price = amount * 1;
      break;
    case "coke":
        price = amount * 1.4;
      break;
    case "snacks":
        price = amount * 2;
      break;
  }

  console.log(price.toFixed(2));
}

calculateOrder('water', 5)
