package com.coderscampus.assignment14.domain;

public class Message {
	
	private Long channelId;
	private String message;
	private User user;
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Message [channelId=" + channelId + ", message=" + message + ", user=" + user + "]";
	}
	
	

}
