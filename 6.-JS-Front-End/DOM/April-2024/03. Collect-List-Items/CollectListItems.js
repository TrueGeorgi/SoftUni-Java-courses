function extractText() {
    let listItems = document.getElementsByTagName('li');

    for (const i of listItems) {
        let textArea = document.getElementById('result');
        textArea.append(i.innerText + '\n');
    }
}