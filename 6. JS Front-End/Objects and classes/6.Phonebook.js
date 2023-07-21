/* Write a function that stores information about a person’s name and phone number. The input is an array of strings
with space-separated name and number. Replace duplicate names. Print the result as shown.*/

function phonebook (inputArr) {
    let phonebook = {};
    for (let entry of inputArr) {
        let nameAndNumber = entry.split(' ');
        phonebook[nameAndNumber[0]] = nameAndNumber[1];
    }

    for(let key in phonebook) {
        console.log(`${key} -> ${phonebook[key]}`);
    }
}

phonebook(['Tim 0834212554',
'Peter 0877547887',
'Bill 0896543112',
'Tim 0876566344']
);