function colorize() {
    let people = Array.from(document.querySelectorAll('tr'));
    
    for (let p = 1; p < people.length; p += 2) {
        people[p].style.backgroundColor = 'Teal'
    }
}