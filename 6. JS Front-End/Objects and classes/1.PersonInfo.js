/*Write a function that receives 3 parameters, sets them to an object, and returns that object.
The input comes as 3 separate strings in the following order: firstName, lastName, age.*/

// option 1

function personInfo (firstName, lastName, age) {
let person = {
    firstName: firstName,
    lastName: lastName,
    age: age,
}

return person;
}

console.log(personInfo('Jhon', 'Marston', '25'))

// option 2

function personInfo2 (firstName2, lastName2, age2) {
let person2 = {};
person2.firstName = firstName2;
person2.LastName = lastName2;
person2.age = age2;

return person2;
}

console.log(personInfo2('Arthur', 'Morgan', '36'))