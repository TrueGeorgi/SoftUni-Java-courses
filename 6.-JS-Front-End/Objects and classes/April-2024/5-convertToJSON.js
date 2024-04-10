function converter(name, lastName, hairColor) {
  let person = {
    name, lastName, hairColor
  }

  let converted = JSON.stringify(person)

  console.log(converted);
}