/* Write a function that manages meeting appointments. The input comes as an array of strings. Each string contains a
weekday and person’s name. For each successful meeting, print a message. If you receive the same weekday twice,
the meeting cannot be scheduled so print a conflicting message. In the end, print a list of all successful meetings.*/

function appointmentsManager (inputArr) {
    let successfulAppointments = {};

    for(let entry of inputArr) {
        let weekdayAndPerson = entry.split(' ');
        let weekday = weekdayAndPerson[0];
        let personName = weekdayAndPerson[1];
        if(successfulAppointments.hasOwnProperty(weekday)) {
            console.log(`Conflict on ${weekday}!`)
        } else {
            console.log(`Scheduled for ${weekday}`)
            successfulAppointments[weekday] = personName;
        } 
    }

    for(let key in successfulAppointments) {
        console.log(`${key} -> ${successfulAppointments[key]}`)
    }
}

appointmentsManager(['Friday Bob',
'Saturday Ted',
'Monday Bill',
'Monday John',
'Wednesday George']
)