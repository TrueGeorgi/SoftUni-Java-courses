function countOccurrences(text, word) {
  let occurrences = 0;

  index = text.indexOf(word);

  while (index != -1) {
    occurrences++;
    index = text.indexOf(word, index + 1);
  }

  console.log(occurrences);
}

countOccurrences("This is a word and it also is a sentence", "is");
countOccurrences(
  "softuni is great place for learning new programming languages",
  "softuni"
);
