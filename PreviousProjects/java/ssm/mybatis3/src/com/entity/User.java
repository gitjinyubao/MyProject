package com.entity;

public class User {
	private String username;
    private int id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Username [username=" + username + ", id=" + id + "]";
	}
	public User(String username, int id) {
		super();
		this.username = username;
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}
