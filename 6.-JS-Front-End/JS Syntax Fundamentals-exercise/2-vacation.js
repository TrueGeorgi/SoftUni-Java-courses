function priceDetermination(groupNumber, groupType, weekday) {
  let price;

  if (groupType == "Business" && groupNumber >= 100) {
    groupNumber -= 10;
  }

  switch (groupType) {
    case "Students":
      switch (weekday) {
        case "Friday":
          price = 8.45;
          break;
        case "Saturday":
          price = 9.8;
          break;
        case "Sunday":
          price = 10.46;
          break;
      }
      break;
    case "Business":
      switch (weekday) {
        case "Friday":
          price = 10.9;
          break;
        case "Saturday":
          price = 15.6;
          break;
        case "Sunday":
          price = 16;
          break;
      }
      break;
    case "Regular":
      switch (weekday) {
        case "Friday":
          price = 15;
          break;
        case "Saturday":
          price = 20;
          break;
        case "Sunday":
          price = 22.5;
          break;
      }
      break;
  }

  price *= groupNumber;

  if (groupType == "Students" && groupNumber >= 30) {
    price *= 0.85;
  }

  if (groupType == "Regular" && groupNumber >= 10 && groupNumber <= 20) {
    price *= 0.95;
  }

  console.log(`Total price: ${price.toFixed(2)}`);
}

priceDetermination(30, "Students", "Sunday");
priceDetermination(40, "Regular", "Saturday");
