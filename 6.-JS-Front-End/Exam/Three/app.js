const recordsUrl = `http://localhost:3030/jsonstore/records`;

const loadButton = document.getElementById("load-records");
loadButton.addEventListener("click", loadRecords)

const recordNameInput = document.getElementById('p-name');
const recordStepsInput = document.getElementById('steps');
const recordCaloriesInput = document.getElementById('calories');

const addButton = document.getElementById('add-record');
addButton.addEventListener('click', addRecord);

const editBtn = document.getElementById('edit-record');
editBtn.addEventListener('click', editRecord);

let currentRecordId = '';

async function editRecord(e) {
  e.preventDefault();

  const name = recordNameInput.value;
  const steps = recordStepsInput.value;
  const calories = recordCaloriesInput.value;

  const recordToBeSend = {
    name,
    steps,
    calories
  }

  await fetch(`${recordsUrl}/${currentRecordId}`, {
    method: 'PUT',
    body: JSON.stringify(recordToBeSend)
  });

  recordNameInput.value = '';
  recordStepsInput.value = '';
  recordCaloriesInput.value = '';

  document.getElementById('add-record').disabled = false;
  document.getElementById('edit-record').disabled = true;

  await loadRecords();
}

async function addRecord(e) {
  e.preventDefault();

  const name = recordNameInput.value;
  const steps = recordStepsInput.value;
  const calories = recordCaloriesInput.value;

  const recordToBeSend = {
    name,
    steps,
    calories
  }

   await fetch(recordsUrl, {
    method: 'POST',
    body: JSON.stringify(recordToBeSend)
  })

  recordNameInput.value = '';
  recordStepsInput.value = '';
  recordCaloriesInput.value = '';

  await loadRecords();
}

async function loadRecords() {

  const response = await fetch(recordsUrl);
  const data = await response.json();

  const records = Object.values(data);
  const ulList = document.getElementById("list");

  console.log(records);

  while (ulList.firstChild) {
    ulList.removeChild(ulList.firstChild);
  }

  records.forEach((record) => renderRecords(record));
}



  function renderRecords(record) {
    const changeBtn = document.createElement("button");
    changeBtn.innerText = "Change";
    changeBtn.classList.add("change-btn");

    changeBtn.addEventListener('click', (e) => {
      recordNameInput.value = record.name;
      recordStepsInput.value = record.steps;
      recordCaloriesInput.value = record.calories;

      currentRecordId = ulList.getAttribute('data-record-id');
      listRecord.remove();

      document.getElementById('add-record').disabled = true;
      document.getElementById('edit-record').disabled = false;
    })

    const deleteBtn = document.createElement("button");
    deleteBtn.innerText = "Delete";
    deleteBtn.classList.add("delete-btn");

    deleteBtn.addEventListener('click', async (e) => {
      await fetch(`${recordsUrl}/${record._id}`, {
        method: 'DELETE',
      });

      await loadRecords();
    })

    const divButtons = document.createElement("div");
    divButtons.classList.add("btn-wrapper");
    divButtons.appendChild(changeBtn);
    divButtons.appendChild(deleteBtn);

    const nameParagraph = document.createElement("p");
    nameParagraph.innerText = `${record.name}`;

    const stepsParagraph = document.createElement("p");
    stepsParagraph.innerText = `${record.steps}`;

    const caloriesParagraph = document.createElement("p");
    caloriesParagraph.innerText = `${record.calories}`;

    const divInfo = document.createElement("div");
    divInfo.classList.add("info");
    divInfo.appendChild(nameParagraph);
    divInfo.appendChild(stepsParagraph);
    divInfo.appendChild(caloriesParagraph);

    const listRecord = document.createElement("li");
    listRecord.classList.add("record");
    listRecord.appendChild(divInfo);
    listRecord.appendChild(divButtons);

    const ulList = document.getElementById("list");
    ulList.setAttribute('data-record-id', record._id);
    ulList.appendChild(listRecord);
  };

