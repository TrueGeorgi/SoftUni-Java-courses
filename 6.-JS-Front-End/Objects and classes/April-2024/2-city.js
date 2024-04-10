function solve(city) {
  let content = Object.entries(city);

  content.forEach((information) => {
    console.log(`${information[0]} -> ${information[1]}`);
  });

}

solve({
  name: "Plovdiv",
  area: 389,
  population: 1162358,
  country: "Bulgaria",
  postCode: "4000",
});
