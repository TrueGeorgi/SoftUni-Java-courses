function censor(text, word) {
  let censorWord = '*'.repeat(word.length);
  let newText;

  newText =  text.replace(word, censorWord);

  console.log(newText);
}

censor("A small sentence with some words", "small");
censor('Find the hidden word', 'hidden');
censor('banana the hidden banana', 'banana');
