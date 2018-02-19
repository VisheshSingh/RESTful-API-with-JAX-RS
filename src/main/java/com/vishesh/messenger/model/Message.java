package com.vishesh.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private long id;
	private String messgae;
	private Date date;
	private String author;

	public Message() {

	}

	public Message(long id, String messgae, String author) {
		this.id = id;
		this.messgae = messgae;
		this.date = new Date();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
