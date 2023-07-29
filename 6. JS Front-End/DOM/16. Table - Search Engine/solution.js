function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);

   function onClick() {

      const searchQuery = document.querySelector('#searchField').value;
      const cells = Array.from(document.querySelectorAll('tbody td'));

      cells.forEach((cell) => {
         cell.parentElement.classList.remove("select");
      })

      cells.forEach((box) => {
         if(box.textContent.includes(searchQuery)) {
           box.parentElement.classList.add("select");
         }
      });
   }
}