function addItem() {
    let newText = document.querySelector('#newItemText').value;
    let newLine = document.createElement('li');
    newLine.textContent = newText;
    let ul = document.querySelector('#items');
    ul.appendChild(newLine);
}