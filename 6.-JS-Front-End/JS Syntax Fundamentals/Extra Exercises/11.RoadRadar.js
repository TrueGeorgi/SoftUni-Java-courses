function radar (speed, area) {

    const areaMap  = new Map ([
        ['motorway', 130],
        ['interstate', 90],
        ['city', 50],
        ['residential', 20]
    ]);

    let speedDifference =  areaMap.get(area) - speed;

    let status = '';

    if (speedDifference < -40) {
        status = 'reckless driving';
    } else if (speedDifference < -20) {
        status = 'excessive speeding';
    } else if (speedDifference < 0) {
        status = 'speeding';
    }

    if (speedDifference >= 0) {
        console.log(`Driving ${speed} km/h in a ${areaMap.get(area)} zone`);
    } else {
        console.log(`The speed is ${Math.abs(speedDifference)} km/h faster than the allowed speed of ${areaMap.get(area)} - ${status}`);
    }
}

radar(21, 'residential');
radar(120, 'interstate');
radar(200, 'motorway');
radar(40, 'city');