function print(stringsArr, num) {
  outputArr = [];

  for (let i = 0; i < stringsArr.length; i += num) {
    outputArr.push(stringsArr[i]);
  }

  console.log(outputArr);
}

print(["5", "20", "31", "4", "20"], 2);
print(["dsa", "asd", "test", "tset"], 2);
print(["1", "2", "3", "4", "5"], 6);
