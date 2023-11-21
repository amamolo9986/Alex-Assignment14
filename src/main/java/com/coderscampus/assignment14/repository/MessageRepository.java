package com.coderscampus.assignment14.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.coderscampus.assignment14.domain.Message;

@Repository
public class MessageRepository {

	private Map<Long, List<Message>> messages = new HashMap<>();

	public Optional<List<Message>> getMessages(Long channelId) {
		List<Message> messagesByChannel = messages.get(channelId);
		return Optional.ofNullable(messagesByChannel);
	}

	public void saveMessage(Long channelId, List<Message> messagesInChannel) {
		messages.put(channelId, messagesInChannel);
	}

}
