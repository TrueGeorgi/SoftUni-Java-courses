function addItem() {
    let newValue = document.getElementById('newItemText').value;
    if (newValue === '') {
        return;
    }

   let newLi = document.createElement('li');
   newLi.innerText = newValue;

   let itemsList = document.getElementById('items');
   itemsList.appendChild(newLi);

   document.getElementById('newItemText').value = '';
}