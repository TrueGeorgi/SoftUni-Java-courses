function colorize() {
   let rows = Array.from(document.querySelectorAll('tr:nth-child(even)'));
   for (let row of rows) {
    row.style.background = 'teal';
   }
}