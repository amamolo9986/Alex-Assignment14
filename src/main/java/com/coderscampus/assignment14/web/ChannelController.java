package com.coderscampus.assignment14.web;

import java.nio.channels.Channel;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.assignment14.service.ChannelService;



@Controller
public class ChannelController {

	@Autowired
	private ChannelService channelService;

	@GetMapping("/welcome")
	public String getWelcome(ModelMap model) {
		List<Channel> channels = channelService.findAll();
		model.put("channels", channels);
		return "welcome";
	}

}
