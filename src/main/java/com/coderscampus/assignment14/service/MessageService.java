package com.coderscampus.assignment14.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment14.domain.Channel;
import com.coderscampus.assignment14.domain.Message;
import com.coderscampus.assignment14.repository.ChannelRepository;
import com.coderscampus.assignment14.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepo;
	@Autowired
	private ChannelRepository channelRepo;

	public List<Message> getMessages(Long channelId) {
		return messageRepo.getMessages(channelId).orElse(new ArrayList<>());
	}

	public void saveMessage(Message message) {
		Long channelId = message.getChannelId();
		Optional<Channel> channelOpt = Optional.ofNullable(channelRepo.findById(channelId));
		if (channelOpt.isPresent()) {
			List<Message> messagesInChannel = getMessages(channelId);
			messagesInChannel.add(message);
			messageRepo.saveMessage(channelId, messagesInChannel);

		}
	}
}
