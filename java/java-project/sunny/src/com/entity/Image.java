package com.entity;

public class Image {
	private    int    id    ;
	private    String   url;
	private    String   user_username  ;
	private    User     user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Image(int id, String url, String user_username, User user) {
		super();
		this.id = id;
		this.url = url;
		this.user_username = user_username;
		this.user = user;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", url=" + url + ", user_username="
				+ user_username + ", user=" + user + "]";
	}
}
