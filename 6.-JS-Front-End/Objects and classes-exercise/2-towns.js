function solve(inputArr) {
  let towns = [];

  for (let el of inputArr) {
    let currentTown = {}
    let infoArr = el.split(" | ");
    currentTown.town = infoArr[0];
    currentTown.latitude = Number(infoArr[1]).toFixed(2);
    currentTown.longitude = Number(infoArr[2]).toFixed(2);

    towns.push(currentTown);
  }

  for (const t of towns) {
    console.log(t);
  }
}



solve(["Sofia | 42.696552 | 23.32601", "Beijing | 39.913818 | 116.363625"]);
