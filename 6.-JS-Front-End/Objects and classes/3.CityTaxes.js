/* This task is an extension of Problem 2, you may use your solution from that task as a base.
You will receive a city’s name (string), population (number), and treasury (number) as arguments, which you will need
to set as properties of an object and return it. In addition to the input parameters, the object must have a property
taxRate with an initial value of 10, and three methods for managing the city:
* collectTaxes() - Increase treasury by population * taxRate
* applyGrowth(percentage) - Increase population by given percentage
* applyRecession(percentage) - Decrease treasury by given percentage

    INPUT:
Your solution will receive three valid parameters. The methods that expect parameters will be tested with valid
input.*/

function createCity(cityName, population, treasury) {
  let city = {
    taxRate: 10,
    cityName: cityName,
    population: population,
    treasury: treasury,

    collectTaxes() {
      this.treasury += this.population * this.taxRate;
    },

    applyGrowth(percentage) {
      this.population += this.population * (percentage / 100);
    },

    applyRecession(percentage) {
      this.treasury -= this.treasury * (percentage / 100);
    },
  };

  return city;
}

let thisCity = createCity('Ruse', 120000, 100);

console.log(thisCity.treasury);

thisCity.collectTaxes();

console.log(thisCity.treasury);

console.log(thisCity.population);

thisCity.applyGrowth(10);

console.log(thisCity.population)

thisCity.applyRecession(10);

console.log(thisCity.treasury);


