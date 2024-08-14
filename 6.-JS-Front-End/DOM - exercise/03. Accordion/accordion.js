function toggle() {
   let headDiv = document.querySelector('span');
   let hiddenDiv = document.querySelector('#extra');

   if (headDiv.innerText === 'MORE') {
    headDiv.innerText = 'LESS'
    hiddenDiv.style.display = 'block';
   } else {
    headDiv.innerText = 'MORE'
    hiddenDiv.style.display = 'none';
   }
}