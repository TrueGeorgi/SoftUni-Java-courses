function ticketPrice (day, age) {
    let priceToBePaid;

    switch (day) {
        case 'Weekday':
            if (age >= 0 && age <= 18) {
                priceToBePaid = '12$';
            } else if (age > 18 && age <= 64) {
                priceToBePaid = '18$';
            } else if (age > 64 && age <= 122) {
                priceToBePaid = '12$';
            } else {
                priceToBePaid = 'Error!'
            }
            break;
        case 'Weekend':
            if (age >= 0 && age <= 18) {
                priceToBePaid = '15$';
            } else if (age > 18 && age <= 64) {
                priceToBePaid = '20$';
            } else if (age > 64 && age <= 122) {
                priceToBePaid = '15$';
            } else {
                priceToBePaid = 'Error!'
            }
            break;
        case 'Holiday':
            if (age >= 0 && age <= 18) {
                priceToBePaid = '5$';
            } else if (age > 18 && age <= 64) {
                priceToBePaid = '12$';
            } else if (age > 64 && age <= 122) {
                priceToBePaid = '10$';
            } else {
                priceToBePaid = 'Error!'
            }
            break;
        default:
            priceToBePaid = 'Error!'
    }
    console.log(priceToBePaid);
}

ticketPrice('Weekday', 22);