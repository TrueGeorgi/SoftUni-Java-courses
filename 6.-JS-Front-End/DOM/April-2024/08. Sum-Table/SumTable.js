function sumTable() {
  let allRows = Array.from(document.querySelectorAll('td'));

  let sum = 0;

  for (let r = 1; r < allRows.length; r+=2) {
    if (r === allRows.length-1) {
      allRows[r].innerText = sum.toFixed(2);
    } else {
      let currentPrice = Number(allRows[r].innerText);
      sum += currentPrice;
    }
  }
}