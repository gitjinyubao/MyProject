package com.entity;

public class Character {
	private   String   user_username;
	private   String   blogtitle;
	private   String   signature;
	private   User     user;
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Character(String user_username, String blogtitle, String signature,
			User user) {
		super();
		this.user_username = user_username;
		this.blogtitle = blogtitle;
		this.signature = signature;
		this.user = user;
	}
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Character [user_username=" + user_username + ", blogtitle="
				+ blogtitle + ", signature=" + signature + ", user=" + user
				+ "]";
	}
}
