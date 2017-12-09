package com.entity;

import java.sql.Timestamp;

public class Message {
	private int id;
	private Timestamp date;
	private String message;
	private int friend_id;
	private int user_id;
	private User user;
	private String user_id_friend;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_id_friend() {
		return user_id_friend;
	}
	public void setUser_id_friend(String user_id_friend) {
		this.user_id_friend = user_id_friend;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(int friend_id) {
		this.friend_id = friend_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public Message(Timestamp date, String message, int friend_id, int user_id,
			 String username) {
		super();
		this.date = date;
		this.message = message;
		this.friend_id = friend_id;
		this.user_id = user_id;
		this.username = username;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", date=" + date + ", message=" + message
				+ ", friend_id=" + friend_id + ", user_id=" + user_id + "]";
	}

}
