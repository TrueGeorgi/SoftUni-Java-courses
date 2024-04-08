function solve(grade) {
  if (grade < 3) {
    console.log(`Fail (${Math.floor(grade)})`);
    return 'Fail'
  } else if (grade < 3.5) {
    console.log(`Poor (${grade.toFixed(2)})`);
    return 'Poor'
  } else if (grade < 4.5) {
    console.log(`Good (${grade.toFixed(2)})`);
    return 'Good'
  } else if (grade < 5.5) {
    console.log(`Very good (${grade.toFixed(2)})`);
    return 'Very good'
  } else {
    console.log(`Excellent (${grade.toFixed(2)})`);
    return 'Excellent'
  }
}










solve(3.33);
solve(4.50);
solve(2.99);