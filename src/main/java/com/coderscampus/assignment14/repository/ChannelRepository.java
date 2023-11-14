package com.coderscampus.assignment14.repository;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ChannelRepository {
	List<Channel> channels = new ArrayList<>();

	public List<Channel> findAll() {
		return channels;
	}

}
