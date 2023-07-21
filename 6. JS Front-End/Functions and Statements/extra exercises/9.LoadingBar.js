loadingBar = (number) => {
  let loading = [".", ".", ".", ".", ".", ".", ".", ".", ".", "."];
  for(let i = 0; i < number / 10; i++) {
    loading.splice(i, 1, '%')
  }
  
  

  if(number === 100) {
    console.log(`${number}% complete!`)
    console.log(`[${loading.join('')}]`)
  } else {
    console.log(`${number}% [${loading.join('')}]`)
    console.log('Still loading...')
  }

};

loadingBar(60)
loadingBar(20)
loadingBar(100)
