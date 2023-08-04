function getInfo() {
  const busStopID = document.querySelector("#stopId").value;
  const list = document.querySelector("ul");

  list.textContent = '';

  fetch(`http://localhost:3030/jsonstore/bus/businfo/${busStopID}`)
    .then((res) => res.json())
    .then((busStop) => {
      document.querySelector("#stopName").textContent = busStop.name;

      Object.entries(busStop.buses).map(([busNumber, timeInMinutes]) => {
        let item = document.createElement("li");
        item.textContent = `Bus ${busNumber} arrives in ${timeInMinutes} minutes`;
        list.appendChild(item);
      });
    })
    .catch(() => {
        document.querySelector("#stopName").textContent = 'Error';
    })
}
