window.addEventListener("load", solve);

function solve() {
    let typeOfAnimalInput = document.getElementById('type');
    let ageInput = document.getElementById('age');
    let selectGenderInput = document.getElementById('gender');

    let buttonAdopt = document.getElementById('adopt-btn');

    buttonAdopt.addEventListener('click', (e) => {
      e.preventDefault();
      let typeOfAnimal = typeOfAnimalInput.value;
      let ageOfAnimal = ageInput.value;
      let genderOfAnimal = selectGenderInput.value;

      if(typeOfAnimal === '' || ageOfAnimal === '' || genderOfAnimal === '') {
        return
      } else {

        const editBtn = document.createElement('button');
        editBtn.classList.add('edit-btn');
        editBtn.innerText = 'Edit';

        editBtn.addEventListener('click', (e) => {
          e.preventDefault();

          typeOfAnimalInput.value = typeOfAnimal;
          ageInput.value = ageOfAnimal;
          selectGenderInput.value = genderOfAnimal;

          listElement.remove();
        })

        const doneBtn = document.createElement('button');
        doneBtn.classList.add('done-btn');
        doneBtn.innerText = 'Done'

        doneBtn.addEventListener('click', (e) => {
          e.preventDefault();
          const adoptedPetsList = document.getElementById('adopted-list');
          listElement.remove();
          doneBtn.remove();
          editBtn.remove();

          const clearBtn = document.createElement('button');
          clearBtn.classList.add('clear-btn');
          clearBtn.innerText = 'Clear'
          divBtns.appendChild(clearBtn);

          clearBtn.addEventListener('click', (e) => {
            e.preventDefault();
            listElement.remove();
          })

          adoptedPetsList.appendChild(listElement);
        })

        const divBtns = document.createElement('div');
        divBtns.classList.add('buttons');
        divBtns.appendChild(editBtn);
        divBtns.appendChild(doneBtn);

        const petParagraph = document.createElement('p');
        petParagraph.innerText = `Pet:${typeOfAnimal}`;

        const genderParagraph = document.createElement('p');
        genderParagraph.innerText = `Gender:${genderOfAnimal}`;

        const ageParagraph = document.createElement('p');
        ageParagraph.innerText = `Age:${ageOfAnimal}`;

        const articleElement = document.createElement('article');
        articleElement.appendChild(petParagraph);
        articleElement.appendChild(genderParagraph);
        articleElement.appendChild(ageParagraph);

        const listElement = document.createElement('li');
        listElement.appendChild(articleElement);
        listElement.appendChild(divBtns);

        let ulElement = document.getElementById('adoption-info');
        ulElement.appendChild(listElement);

        
        typeOfAnimalInput.value = '';
        ageInput.value = '';
        selectGenderInput.value = '';
      }
    })
  }
  