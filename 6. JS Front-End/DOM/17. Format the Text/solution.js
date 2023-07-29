function solve() {
  const text = document.querySelector("textarea").value;
  const sentences = text.split(".");
  sentences.forEach((sentence) => {
    if (sentence === "") {
      let index = sentences.indexOf(sentence);
      sentences.splice(index, 1);
    }
  });

  while (sentences.length > 0) {
    let textParagraph = "";
    let p = '';
    if (sentences.length <= 3) {
      textParagraph = sentences.join(". ");
      p = document.createElement("p");
      p.textContent = textParagraph;

      document.querySelector("#output").appendChild(p);
      break;
    } else {
      threeSentences = [sentences.shift(), sentences.shift(), sentences.shift()];
      textParagraph = threeSentences.join(". ");
      p = document.createElement("p");
      p.textContent = textParagraph;
      document.querySelector("#output").appendChild(p);
    }
  }
}
