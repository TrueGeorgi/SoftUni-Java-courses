function sumTable() {
let items = Array.from(document.querySelectorAll('td'));
let sum = 0;

for (let i = 1; i < items.length - 2; i += 2) {
    let currentPrice = Number(items[i].textContent);
    sum += currentPrice;
}

items[items.length - 1].textContent = sum;

console.log(items)
}