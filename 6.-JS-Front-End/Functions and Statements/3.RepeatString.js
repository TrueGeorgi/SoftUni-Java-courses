function concatString (input, times) {

    let output = '';

    for (let i = 1; i <= times; i++) {
        output += input;
    }

    console.log(output)
}

concatString('Hello', 5)