function rotation(inputArr, rotations) {
  let savedNum;
  for (let i = 1; i <= rotations; i++) {
       savedNum = inputArr.splice(0,1);
       inputArr.push(savedNum);
  }

  console.log(inputArr.join(' '));
}

rotation([51, 47, 32, 61, 21], 2 );
rotation([32, 21, 61, 1], 4 );
rotation([2, 4, 15, 31], 5);