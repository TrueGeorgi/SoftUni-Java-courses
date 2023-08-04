function addItem() {
   let value = document.querySelector('#newItemText').value;
   let newLine = document.createElement('li');
   let del = document.createElement('a');

   newLine.textContent = value;
   del.href = '#';
   del.textContent = '[Delete]';
   del.addEventListener('click', (e) => {
    e.target.parentElement.remove();
   })

   newLine.appendChild(del);

   document.querySelector('ul').appendChild(newLine)
}