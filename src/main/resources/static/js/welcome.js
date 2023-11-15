document.addEventListener('DOMContentLoaded', function () {
    // Display the welcome prompt when the page is loaded
    showWelcomePrompt();
});

function showWelcomePrompt() {
    var username;

    while (!username) {
        // Use window.prompt to display a dialog box with an input field
        username = prompt('What\'s your name?');

        // Check if the user clicked "Cancel"
        if (username === null) {
            // Handle the case where the user clicked "Cancel"
            alert('You didn\'t enter a name. Please try again.');
        }
    }
    // User entered a name, save it to session storage.
    // this says "I want to store the value of the `username` variable 
    // in sessionStorage and label it with the key `'username'` "
    sessionStorage.setItem('username', username);

    // Display a welcome message
    alert('Welcome, ' + username + '!');
}