package com.coderscampus.assignment14.domain;

public class Channel {
	private Long channelId;
	private String channelName;

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public String toString() {
		return "Controller [channelId=" + channelId + ", channelName=" + channelName + "]";
	}

	
}
