package com.WebApp.Locket.Messenger.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Message {
	
	private long Id;
	private String message;
	private Date created;
    private String Author;
    
    
	public Message(long id, String message, String author) {
		super();
		this.Id = id;
		this.message = message;
		this.created = new Date();
		this.Author = author;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		this.Author = author;
	}
    
  
}

