function subtract() {
    let valueOne = document.querySelector('#firstNumber').value;
    let valueTwo = document.querySelector('#secondNumber').value;

    let result = valueOne - valueTwo;

    document.getElementById('result').innerText = result;
}