function lockedProfile() {
    let infoButtons = Array.from(document.querySelectorAll('button'));
    let lockButtons = Array.from(document.querySelectorAll('input[value="lock"]'))
    let unlockButtons = Array.from(document.querySelectorAll('input[value="unlock"]'))

    infoButtons.forEach(button => {
        button.addEventListener('click', (e) => {
            const lockedRadioButton = e.currentTarget.parentElement.querySelector('input[type="radio"]');

            if (!lockedRadioButton.checked) {
            let profile = button.parentElement;
            let userFields = profile.querySelector('div');
            userFields.style.display = userFields.style.display === 'block' ? 'none' : 'block';
            button.textContent = userFields.style.display === 'block' ? 'Hide it' : 'Show more';
            }
        })
    })
}
