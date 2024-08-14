function create(words) {
  words.forEach((el) => {
    let div = document.createElement("div");
    let p = document.createElement("p");
    p.innerText = el;
    console.log(p);
    p.style.display = "none";
    div.addEventListener("click", displayParagraph);

    div.appendChild(p);

    let motherDiv = document.getElementById("content");

    motherDiv.appendChild(div);
  });

  function displayParagraph(e) {
    let currentTarget = e.currentTarget;
    let currentP = currentTarget.querySelector("p");

    if (currentP.style.display === "") {
      currentP.style.display = "none";
    } else {
      currentP.style.display = "";
    }
  }
}
