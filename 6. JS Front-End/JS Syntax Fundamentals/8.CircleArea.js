function circleArea (input) {
    const inputType = typeof(input);
    if(inputType === 'number') {
        let result = Math.pow(input, 2) * Math.PI;
        console.log(result.toFixed(2));
    } else {
        console.log(`We can not calculate the circle area, because we receive a ${inputType}.`);
    }
}

circleArea(2);
circleArea('name');
circleArea(5.25432);