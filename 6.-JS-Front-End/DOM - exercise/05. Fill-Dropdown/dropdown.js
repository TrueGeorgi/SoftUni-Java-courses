function addItem() {
    let itemText = document.getElementById('newItemText')
    let itemValue = document.getElementById('newItemValue')

    if(itemText.value === '' || itemValue.value === '') {
        return
    }

    let optionEl = document.createElement('option');
    optionEl.textContent = itemText.value;
    optionEl.value = itemValue.value;
    let selectMenu = document.getElementById('menu');
    console.log(optionEl);
    selectMenu.appendChild(optionEl);
    itemText.value = '';
    itemValue.value = '';

}