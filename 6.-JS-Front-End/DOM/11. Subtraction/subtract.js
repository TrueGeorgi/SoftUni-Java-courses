function subtract() {
    let number1 = Number(document.querySelector('#firstNumber').value);
    let number2 = Number(document.querySelector('#secondNumber').value);

    let result = number1 - number2;
    let newParagraph = document.createElement('p');
    
    newParagraph.textContent = result;
    document.querySelector('#result').appendChild(newParagraph);
}