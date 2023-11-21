package com.coderscampus.assignment14.domain;

public class Message {

	private Long channelId;
	private String messageContents;
	private User user;

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getMessageContents() {
		return messageContents;
	}

	public void setMessageContents(String messageContents) {
		this.messageContents = messageContents;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Message [channelId=" + channelId + ", messageContents=" + messageContents + ", user=" + user + "]";
	}
	
	
	
}
