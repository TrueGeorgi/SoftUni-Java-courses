/* Write a function that stores information about a person’s name and his address. The input comes as an array of
strings. Each string contains the name and the address separated by a colon. If you receive the same name twice
just replace the address. In the end, print the full list, sorted alphabetically by the person’s name.*/

function addressBook(inputArr) {
  let phonebook = {};
  for (let entry of inputArr) {
    let [name, address] = entry.split(":");
    phonebook[name] = address;
  }

  let phonebookArr = Object.entries(phonebook);

  phonebookArr.sort(([key1, value1], [key2, value2]) => key1.localeCompare(key2));

  for (let entry of phonebookArr) {
    console.log(`${entry[0]} -> ${entry[1]}`);
  }
}

addressBook(['Bob:Huxley Rd',
'John:Milwaukee Crossing',
'Peter:Fordem Ave',
'Bob:Redwing Ave',
'George:Mesta Crossing',
'Ted:Gateway Way',
'Bill:Gateway Way',
'John:Grover Rd',
'Peter:Huxley Rd',
'Jeff:Gateway Way',
'Jeff:Huxley Rd']
)
