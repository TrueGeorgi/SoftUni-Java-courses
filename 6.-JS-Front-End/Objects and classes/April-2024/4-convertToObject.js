function converter(jsonObject) {
  let person = JSON.parse(jsonObject);

  let entries = Object.entries(person);

  entries.forEach((e) => {
    console.log(`${e[0]}: ${e[1]}`);
  })
}