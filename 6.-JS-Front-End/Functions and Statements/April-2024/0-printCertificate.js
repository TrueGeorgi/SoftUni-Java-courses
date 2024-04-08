function print(grade, arrNames) {

  if (solve(grade) != 'Fail') {
  console.log('~~~- {@} -~~~');
  console.log('~- Certificate -~');
  console.log('~~~- ~---~ -~~~');
  console.log(`${arrNames[0]} ${arrNames[1]}`);
  console.log(`${solve(grade)} (${grade})`);
  } else {
    console.log('Student does not qualify');
  }

  function solve(grade) {
    if (grade < 3) {
      return "Fail";
    } else if (grade < 3.5) {
      return "Poor";
    } else if (grade < 4.5) {
      return "Good";
    } else if (grade < 5.5) {
      return "Very good";
    } else {
      return "Excellent";
    }
  }
}

print(5.25, ['Peter', 'Carter']);

// ~~~- {@} -~~~
// ~- Certificate -~
// ~~~- ~---~ -~~~
// Peter Carter
// Very good (5.25)