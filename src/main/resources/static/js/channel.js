var sendButton = document.querySelector(`#send-button`)
var messageInput = document.querySelector(`#message-input`)

var user = JSON.parse(sessionStorage.getItem('user'))
var channelId = messageInput.getAttribute('data-id')

function sendMessage() {
    console.log('Send button clicked')
    var message = {
        'channelId': channelId,
        'messageContents': messageInput.value,
        'user': user,
    }
    messageInput.value = ''
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
        });
}

sendButton.addEventListener('click', sendMessage)

messageInput.addEventListener('keydown', function (event) {
    if (event.key === 'Enter') {
        event.preventDefault()
        sendMessage()
    }
});

setInterval(getMessages, 500)

function getMessages() {
    console.log(`Fetching messages for channel ID: ${channelId}`)
    var conversationBox = document.querySelector('#conversation-box')
    fetch(`/messages/${channelId}`)
        .then(response => response.json())
        .then(data => {
            conversationBox.innerHTML = ''
            data.forEach(message => {
                conversationBox.innerHTML += `<div>
			  <span><b>${message.user.name}</b>: ${message.messageContents}</span>
			</div>`
            })
        })
}


