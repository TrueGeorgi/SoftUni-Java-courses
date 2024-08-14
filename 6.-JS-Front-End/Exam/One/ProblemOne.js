function solve(inputArr) {
  let spell = inputArr[0];

  let commandRaw = inputArr[1];
  let commandCount = 1;

  while (commandRaw !== "End") {
    let splitedCommand = commandRaw.split("!");
    let command = splitedCommand[0];

    switch (command) {
      case "RemoveEven":
        let newSpell = "";
        for (let i = 0; i < spell.length; i += 2) {
          let letter = spell.charAt(i);
          newSpell += letter;
        }
        spell = newSpell;
        console.log(spell);
        break;
      case "TakePart":
        let fromIndex = splitedCommand[1];
        let toIndex = splitedCommand[2];

        let partOfSpell = spell.slice(fromIndex, toIndex);
        spell = partOfSpell;
        console.log(spell);
        break;
      case "Reverse":
        let substring = splitedCommand[1];
        if (spell.includes(substring)) {
          let startIndex = spell.indexOf(substring);
          let endIndex = startIndex + substring.length;

          let substringToBeEdited = spell.substring(startIndex, endIndex);
          let reversedSubstr = substringToBeEdited.split("").reverse().join("");
          let modifiedStr = spell.replace(substring, "") + reversedSubstr;
          spell = modifiedStr;
          console.log(spell);
        } else {
          console.log("Error");
        }
        break;
    }
    commandCount++;
    commandRaw = inputArr[commandCount];
  }

  console.log(`The concealed spell is: ${spell}`);
}

// solve([
//   "asAsl2adkda2mdaczsa",
//   "RemoveEven",
//   "TakePart!1!9",
//   "Reverse!maz",
//   "End",
// ]);

solve([
  "hZwemtroiui5tfone1haGnanbvcaploL2u2a2n2i2m",
  "TakePart!31!42",
  "RemoveEven",
  "Reverse!anim",
  "Reverse!sad",
  "End",
]);
