document.addEventListener('DOMContentLoaded', function () {
    showWelcomePrompt();
});

function showWelcomePrompt() {
    var username;
    while (!username) {
        username = prompt(`What's your name?`);
        if (username === null) {
            alert(`You didn't enter a name. Please try again.`);
        }
    }
    alert('Welcome, ' + username + '!');

    fetch('/welcome', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: username,
    })
        .then(user => {
            sessionStorage.setItem('user', JSON.stringify(user));
        });
}