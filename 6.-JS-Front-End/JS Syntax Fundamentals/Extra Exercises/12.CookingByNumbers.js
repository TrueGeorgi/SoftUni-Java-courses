function cooking(number, ...commands) {
  for (let i = 0; i < commands.length; i++) {
    switch (commands[i]) {
      case "chop":
        number /= 2;
        break;
      case "dice":
        number = Math.sqrt(number);
        break;
      case "spice":
        number += 1;
        break;
      case "bake":
        number *= 3;
        break;
      case "fillet":
        number *= 0.8;
        break;
    }
    console.log(number);
  }
}

cooking('32', 'chop', 'chop', 'chop', 'chop', 'chop');
