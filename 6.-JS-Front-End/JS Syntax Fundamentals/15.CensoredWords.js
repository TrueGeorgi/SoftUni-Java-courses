function censorship (text, word) {

    let censored = text.replace(word, repeat(word));

    let censoredWord = repeat(word);

    while(censored.includes(word)) {
        censored = censored.replace(word, censoredWord);
    }
    

    function repeat(word) {
        let output = '';
        for(let i = 0; i < word.length; i++) {
            output += '*';
        }
        return output;
    }

    console.log(censored);
}

censorship ('The wheels on the bus go round and round, round and round, round and round. The wheels on the bus go round and round', 'round');