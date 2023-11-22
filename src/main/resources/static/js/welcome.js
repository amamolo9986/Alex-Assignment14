document.addEventListener(`DOMContentLoaded`, function () {
    showWelcomePrompt()
});

var user = sessionStorage.getItem(`user`)

function showWelcomePrompt() {
    var name
    while (!name) {
        name = prompt(`What's your name?`)
        if (name === null) {
            alert(`You didn't enter a name. Please try again.`)
        }
    }
    alert(`Welcome, ${name}!`)

    fetch('/welcome', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: name, // this was my issue - it was stringifying a string and coming into my server as a string!
    })
        .then((response) => response.json())  // Parse the JSON response
        .then((user) => {
            sessionStorage.setItem('user', JSON.stringify(user))
            console.log(user)
        });
}