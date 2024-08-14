function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);

   function onClick() {
      let inputValue = document.getElementById('searchField').value;

      if(inputValue === '') {
         return;
      }

      let studentsInfos = [...document.querySelectorAll('tbody tr')];

      studentsInfos.forEach(tr => tr.classList.remove('select'))

      studentsInfos.forEach(tr => {
         let trInfos = [...tr.querySelectorAll('td')]
         for (const td of trInfos) {
            console.log(td);
            let tdText = td.innerText;
            if(tdText.includes(inputValue)) {
               tr.classList.add('select')
            }
         }
      })
   }

   document.getElementById('searchField').value = '';
}