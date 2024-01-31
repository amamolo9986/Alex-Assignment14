package com.coderscampus.assignment14.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coderscampus.assignment14.domain.Channel;

@Component
public class ChannelRepository {

	List<Channel> channels = new ArrayList<>();
	
	public ChannelRepository() {
        Channel generalChannel = new Channel();
        generalChannel.setChannelId(1L);
        generalChannel.setChannelName("General");
        channels.add(generalChannel);
    }
     
	public List<Channel> findAll() {
		return channels;
	}

	public Channel findById(Long channelId) {
		return channels.stream().filter(channel -> channel.getChannelId()
					   .equals(channelId))
					   .findFirst()
					   .orElse(null);
	}
}
