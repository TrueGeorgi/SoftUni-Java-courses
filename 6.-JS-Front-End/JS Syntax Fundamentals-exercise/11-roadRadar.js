function speedRadar(speed, areaType) {
  let motorwayLimit = 130;
  let interstateLimit = 90;
  let cityLimit = 50;
  let residentalAreaLimit = 20;

  switch (areaType) {
    case "motorway": overTheLimit(motorwayLimit, speed)
    break;
    case "interstate": overTheLimit(interstateLimit, speed)
    break;
    case "city": overTheLimit(cityLimit, speed)
    break;
    case "residential": overTheLimit(residentalAreaLimit, speed)
    break;
  }

  function overTheLimit(limit, speed) {
    if (limit >= speed) {
      console.log(`Driving ${speed} km/h in a ${limit} zone`);
    } else {
      let more = speed - limit;
      let status = '';
  
      if (more <= 20) {
        status = 'speeding';
      } else if (more <= 40) {
        status = 'excessive speeding'
      } else {
        status = 'reckless driving'
      }
  
      console.log(`The speed is ${more} km/h faster than the allowed speed of ${limit} - ${status}`);
    }
  }
}


