function extractText() {
    let listElements = document.querySelectorAll('li');
    let textArea = document.querySelector('#result');

    for(let node of listElements) {
        textArea.value += node.textContent + '\n';
    }
}