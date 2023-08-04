function rotation(array, spins) {
  for (let i = 1; i <= spins; i++) {
    array.push(array.shift());
  }

  console.log(array.join(" "));
}

rotation([1, 2, 3, 4, 5], 2);