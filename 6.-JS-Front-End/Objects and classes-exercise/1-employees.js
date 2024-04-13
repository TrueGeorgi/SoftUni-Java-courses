function setPersonalNumber(arrayInput) {
  let newArr = {};

  arrayInput.forEach((element) => {
    let name = element;
    let personalNumer = element.length;
    newArr[name] = personalNumer;
  });

  for (const employee in newArr) {
    console.log(`Name: ${employee} -- Personal Number: ${newArr[employee]}`);
  }
}

setPersonalNumber([
  "Silas Butler",
  "Adnaan Buckley",
  "Juan Peterson",
  "Brendan Villarreal",
]);
