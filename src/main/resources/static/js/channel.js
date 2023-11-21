var sendButton = document.querySelector('#send-button')
var messageInput = document.querySelector('#message-input')

var user = JSON.parse(sessionStorage.getItem('user'));
var channelId = messageInput.getAttribute('data-id');

sendButton.addEventListener('click', () => {
    console.log('Send button clicked');
    var message = {
        "channelId": channelId,
        "messageContents": messageInput.value,
        "user": {
            "userId": user.userId,
            "name": user.name
        }
    }
    fetch('/message', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(message)
    })
        .then(response => response.json())
        .then(data => {
            console.log(data)
        })
})

setInterval(getMessages, 500)

function getMessages() {
    console.log(`Fetching messages for channel ID: ${channelId}`);
    var conversationBox = document.querySelector('#conversation-box')
    fetch(`/messages/${channelId}`)
        .then(response => response.json())
        .then(data => {
            conversationBox.innerHTML = ''
            data.forEach(message => {
                const userName = JSON.parse(message.user.name);
                conversationBox.innerHTML += `<div>
			  <span>${message.user.name}: ${message.messageContents}</span>
			</div>`
            })
        })
}