package com.entity;

public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}
	private  int   id;
	private  String  username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
