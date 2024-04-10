function load(num) {
  percentRepeats = Math.floor(num / 10);
  let filled = '%'.repeat(percentRepeats)
  let dots = '.'.repeat(10 - percentRepeats);

  console.log(`${num}% [${filled}${dots}]`);

  if(num === 100) {
    console.log('100% Complete!');
  } else {
    console.log('Still loading...');
  }
} 