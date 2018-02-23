package com.WebApp.Locket.Messenger.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.WebApp.Locket.Messenger.Database.DatabaseClass;
import com.WebApp.Locket.Messenger.Model.Message;

public class MessageService {
	
	private Map<Long,Message> messages = DatabaseClass.getAllMessages();
    
	public List<Message> getALLMessages(){
		
		  return new ArrayList<Message>(messages.values());
	}
	
	public Message getAllMessages(long Id) {
		return messages.get(Id);
		
	}
	public Message AddMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message UpdateMessage(Message message) {
		if(message.getId()<=0) {
			return null;
		}
		messages.put(message.getId(),message);
			return message;
			
		}
	public Message RemoveMessage(long Id) {
		return messages.remove(Id);
	}
	}

