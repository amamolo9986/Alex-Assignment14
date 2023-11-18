package com.coderscampus.assignment14.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment14.domain.Message;
import com.coderscampus.assignment14.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	
}
