package com.vishesh.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.vishesh.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello world!", "Vishesh");
		Message m2 = new Message(2L, "Hello Jersey!", "Vishesh");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
