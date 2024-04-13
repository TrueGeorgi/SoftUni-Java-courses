function focused() {
    let sections = Array.from(document.querySelectorAll('input'));

    for (let i = 0; i < sections.length; i++) {
        sections[i].addEventListener('focus', focusOn);
        sections[i].addEventListener('blur', blurOut);
    }

    function focusOn(e) {
        let currentTarget = e.currentTarget;
        let parent = currentTarget.parentNode;

        parent.classList.add('focused');
    }

    function blurOut(e) {
        let currentTarget = e.currentTarget;

        let parent = currentTarget.parentNode;

        parent.classList.remove('focused');
    }
}