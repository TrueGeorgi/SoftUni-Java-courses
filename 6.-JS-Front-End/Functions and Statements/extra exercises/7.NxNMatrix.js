function matrix (number) {
    for(let i = 1; i <= number; i++) {
        let output = [];
        for(let j = 1; j <= number; j++) {
            output.push(number);
        }
        console.log(output.join(' '));
    }
}

matrix(3)