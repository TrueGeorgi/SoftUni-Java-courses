function addItem() {
    const button = document.querySelector('input[type="button"]');
    let newText = document.getElementsByTagName('input')[0].value;
    let newValue = document.getElementsByTagName('input')[1].value;
    const menu = document.getElementById('menu');

    let option = document.createElement('option');

        if (newText !== '') {
            option.textContent = newText;
            option.setAttribute('value', newValue);
            menu.appendChild(option);
            document.getElementsByTagName('input')[0].value = '';
            document.getElementsByTagName('input')[1].value = '';
        }
}