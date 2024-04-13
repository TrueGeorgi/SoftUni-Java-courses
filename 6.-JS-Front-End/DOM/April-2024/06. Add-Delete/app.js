function addItem() {
    let newValue = document.getElementById('newItemText').value;
    if (newValue === '') {
        return;
    }

   let newLi = document.createElement('li');
   let newP = document.createElement('p');
   let newA = document.createElement('a');

   newP.innerText = newValue;
   newA.innerText = '[Delete]'
   newA.addEventListener('click', deleteEl)

   newLi.appendChild(newP);
   newLi.appendChild(newA);

   let itemsList = document.getElementById('items');
   itemsList.appendChild(newLi);

   document.getElementById('newItemText').value = '';


   function deleteEl(e) {
    let currentTarget = e.currentTarget;
    let paragraph = currentTarget.parentNode;
    paragraph.parentNode.removeChild(paragraph)
   }
}