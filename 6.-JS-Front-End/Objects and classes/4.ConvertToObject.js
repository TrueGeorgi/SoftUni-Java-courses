/* Write a function that receives a string in JSON format and converts it to an object.
Loop through all the keys and print them with their values in format: "{key}: {value}"
Use JSON.parse() method to parse JSON string to an object
 */

function converterJSON (input) {
let objects = JSON.parse(input);
let entries = Object.entries(objects);
for(let [key, value] of entries) {
    console.log(`${key}: ${value}`)
}
}


converterJSON('{"name": "George", "age": 40, "town": "Münster"}')
