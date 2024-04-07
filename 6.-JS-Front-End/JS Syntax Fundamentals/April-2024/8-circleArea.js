function edditor (input) {
  typeOfElement = typeof input;

  switch (typeOfElement) {
    case 'number': console.log((Math.pow(input, 2) * Math.PI).toFixed(2));
    break;
    default : console.log(`We can not calculate the circle area, because we receive a ${typeOfElement}.`);
  }
}