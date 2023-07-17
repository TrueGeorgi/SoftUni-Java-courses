function ticketPrice(amountOfPeople, typeOfTicket, weekday) {
  let price;
  switch (typeOfTicket) {
    case "Students":
      price = weekdayPrices(8.45, 9.8, 10.46, weekday) * amountOfPeople;
      if (amountOfPeople >= 30) {
        price *= 0.85;
      }
      break;

    case "Business":
      if (amountOfPeople >= 100) {
        amountOfPeople -= 10;
      }
      price = weekdayPrices(10.9, 15.6, 16, weekday) * amountOfPeople;
      break;

    case "Regular":
      price = weekdayPrices(15, 20, 22.5, weekday) * amountOfPeople;
      if(amountOfPeople >= 10 && amountOfPeople <= 20) {
        price *= 0.95;
      }
      break;
  }

  console.log(`Total price: ${price.toFixed(2)}`);
}

function weekdayPrices(friday, saturday, sunday, weekday) {
  switch (weekday) {
    case "Friday":
      return friday;
      break;
    case "Saturday":
      return saturday;
      break;
    case "Sunday":
      return sunday;
      break;
  }
}

ticketPrice(40, "Regular", "Saturday");
ticketPrice(30, "Students", "Sunday");
