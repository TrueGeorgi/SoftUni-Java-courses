function print(array, number) {
  const output = [];

  for (let i = 0; i <= array.length; i++) {
    if (i === 0 || i % number === 0) {
      output.push(array[i]);
    }
  }

  return output.join("\n");
}