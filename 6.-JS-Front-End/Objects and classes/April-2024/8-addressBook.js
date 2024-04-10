function solve(inputArr) {
  let people = {};

  for (input of inputArr) {
    let separetedNamesAddress = input.split(":");

    let names = separetedNamesAddress[0];
    let address = separetedNamesAddress[1];

    people[names] = address;
  }

  let addressBook = Object.entries(people);

  addressBook.sort((a, b) => {
    let first = a[0]
    let second = b[0]

    return first < second ? -1 : (first > second ? 1 : 0);
  });

  addressBook.forEach((a) => {
    console.log(`${a[0]} -> ${a[1]}`);
  });
}

solve([
  "Tim:Doe Crossing",
  "Bill:Nelson Place",
  "Peter:Carlyle Ave",
  "Bill:Ornery Rd",
]);
