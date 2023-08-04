function countOccurences (text, searchedWord) {
    let words = text.split(' ');
    let count = 0;

    for(let word of words) {
        if (word === searchedWord) {
            count++;
        }
    }

    console.log(count)
}

countOccurences('The wheels on the bus go round and round , round and round , round and round. The wheels on the bus go round and round', 'round');