function typeOfPerson (age) {

let typePerson;

if (age >= 66) {
typePerson = 'elder';
} else if (age >= 20) {
    typePerson = 'adult';
} else if (age >= 14) {
    typePerson = 'teenager';
} else if (age >= 3) {
    typePerson = 'child';
} else if (age >= 0) {
    typePerson = 'baby';
} else {
    typePerson = 'out of bounds';
}

console.log(typePerson);
}

typeOfPerson(1);
typeOfPerson(6);
typeOfPerson(17);
typeOfPerson(33);
typeOfPerson(100);
typeOfPerson(-100);

