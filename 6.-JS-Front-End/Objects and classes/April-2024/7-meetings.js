function solve(stringsArr) {
  let meetings = {};

  for(el of stringsArr) {
    separeted = el.split(" ");
    day = separeted[0];
    person = separeted[1];

    if (meetings.hasOwnProperty(day)) {
      console.log(`Conflict on ${day}!`);
    } else {
      meetings[day] = person;
      console.log(`Scheduled for ${day}`);
    }
  }

  for (const key in meetings) {
    console.log(`${key} -> ${meetings[key]}`);
  }
}