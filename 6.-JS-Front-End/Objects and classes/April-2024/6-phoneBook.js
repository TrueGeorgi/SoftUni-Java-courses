function solve(inputArr) {
  let phoneBook = {};
  inputArr.forEach((el) => {
    info = el.split(" ");
    phoneBook[info[0]] = info[1];
  });

  for(key in phoneBook) {
    console.log(`${key} -> ${phoneBook[key]}`);
  }
}

solve([
  "Tim 0834212554",
  "Peter 0877547887",
  "Bill 0896543112",
  "Tim 0876566344",
]);
