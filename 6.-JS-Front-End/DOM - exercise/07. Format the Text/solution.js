function solve() {
  let textArea = document.querySelector('textarea')
  let textInput = textArea.value;
  // textArea.value = '';
  let outputArea = document.getElementById('output');
  let textInputArrRow = [...textInput.split('.')];
  let textInputArr = [];

  // console.log(textInputArrRow);

  textInputArrRow.forEach(tr => {
    if (tr.trim().length > 0) {
      textInputArr.push(tr);
    }
  })

  let counter = 0;
  let formatedText = '';

  textInputArr.forEach(ti => {
    if (counter === 3) {
      counter = 0;
      let newP = `<p>${formatedText.trim()}</p>`;
      outputArea.innerHTML += newP;
      formatedText = '';
    }
    formatedText += ti + '.';
    console.log(formatedText);
    counter++;
  })

  if(counter !== 0) {
    let newP = `<p>${formatedText.trim()}</p>`;
    outputArea.innerHTML += newP;
    formatedText = '';
  }

  textArea.value = '';
}