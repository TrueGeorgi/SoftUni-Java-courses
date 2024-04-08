function totalOrderPrice(product, amount) {
  let totalAmount = 0;

  switch(product) {
    case 'coffee': totalAmount = amount * 1.5;
    break;
    case 'water': totalAmount = amount * 1;
    break;
    case 'coke': totalAmount = amount * 1.4;
    break;
    case 'snacks': totalAmount = amount * 2;
    break;
  }

  console.log(totalAmount.toFixed(2));
}



totalOrderPrice("water", 5);
totalOrderPrice("coffee", 2);