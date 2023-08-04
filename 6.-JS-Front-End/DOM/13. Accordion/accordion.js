// Option 1

let on = false; // toggle()

function toggle() {

    if (on === false) {
        document.querySelector('span.button').textContent = 'Less';
        document.querySelector('#extra').style.display = 'block';
        on = true;
    } else {
        document.querySelector('span.button').textContent = 'More';
        document.querySelector('#extra').style.display = 'none';
        on = false;
    }
}


// Option 2

function toggle1() {
    const content = document.querySelector('#extra');
    const button = document.querySelector('span.button');

    if (content.style.display !== 'block') {
        content.style.display = 'block';
        button.textContent = 'Less';
    } else {
        content.style.display = 'none';
        button.textContent = 'More';
    }
}

// Option 3 

function toggle2() {
    const content = document.querySelector('#extra');
    const button = document.querySelector('span.button');

    content.style.display = content.style.display === 'block' ? 'none' : 'block';
    button.textContent = button.textContent === 'Less' ? 'More' : 'Less';
}