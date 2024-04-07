function promotionsApplier(day, age) {
  let message;

  switch (day) {
    case "Weekday":
      if (age >= 0 && age <= 18) {
        message = "12$";
      } else if (age > 18 && age <= 64) {
        message = "18$";
      } else if (age > 64 && age <= 122) {
        message = "12$";
      } else {
        message = "Error!";
      }
      break;
    case "Weekend":
      if (age >= 0 && age <= 18) {
        message = "15$";
      } else if (age > 18 && age <= 64) {
        message = "20$";
      } else if (age > 64 && age <= 122) {
        message = "15$";
      } else {
        message = "Error!";
      }
      break;
    case "Holiday":
      if (age >= 0 && age <= 18) {
        message = "5$";
      } else if (age > 18 && age <= 64) {
        message = "12$";
      } else if (age > 64 && age <= 122) {
        message = "10$";
      } else {
        message = "Error!";
      }
      break;
  }

  console.log(message);
}
