function deleteByEmail() {
    let newValue = document.getElementsByTagName('input')[0].value;
    
    let people = document.querySelectorAll('tbody tr');

    let newParagraph = document.createElement('p');
    newParagraph.id = 'pop-up-message';
    let newText = '';
    
    for (const person of people) {
        let mail = person.getElementsByTagName('td')[1].innerText;

        if (mail === newValue) {
            newParagraph.innerText = 'Deleted';
            newText = 'Deleted'
           person.parentNode.removeChild(person);
           break;
        } else {
            newParagraph.innerText = 'Not found.';
            newText = 'Not found.';
        }
    }

    let found = document.getElementById('pop-up-message');

    if (!found) {
        document.getElementsByTagName('body')[0].appendChild(newParagraph)
    } else {
        document.getElementById('pop-up-message').innerText = newText;
    }
}