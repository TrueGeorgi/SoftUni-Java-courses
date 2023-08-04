function create(words) {
  words.forEach((element) => {
    let newDiv = document.createElement("div");
    let newParagraph = document.createElement("p");

    newParagraph.textContent = element;
    newParagraph.style.display = 'none';

    newDiv.appendChild(newParagraph);

    newDiv.addEventListener('click', () => {
      newParagraph.style.display = 'block';
    });

    
    document.querySelector('#content').appendChild(newDiv);
  });
}
