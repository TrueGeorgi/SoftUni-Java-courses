function reverse (num, arrayInput) {

    let arrayRawOutput = [];

    for(let i = 0; i < num; i++) {
        arrayRawOutput.push(arrayInput[i]);
    }

    let reversedOutput = '';

    for(let i = arrayRawOutput.length - 1; i >= 0; i--) {
        reversedOutput += `${arrayRawOutput[i]} `
    }

    console.log(reversedOutput);
}