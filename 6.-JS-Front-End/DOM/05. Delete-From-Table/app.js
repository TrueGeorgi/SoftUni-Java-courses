function deleteByEmail() {
    let textInput = document.getElementsByTagName('input')[0].value;

    let emails = document.querySelectorAll("td:nth-child(even)");

    let found = false;

    for ( let td of emails) {
        if (td.textContent === textInput) {
            found = true;
            document.querySelector('#result').textContent = 'Deleted';
            let row = td.parentNode;
            row.parentNode.removeChild(row);
        } else if (!found) {
            document.querySelector('#result').textContent = 'Not found.'
        }
    }
}