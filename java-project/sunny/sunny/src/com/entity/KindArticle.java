package com.entity;

public class KindArticle {
	private   int   id;
	private   String  user_username;
	private   String  kind_name;
	private   User  user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getKind_name() {
		return kind_name;
	}
	public void setKind_name(String kind_name) {
		this.kind_name = kind_name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "KindArticle [id=" + id + ", user_username=" + user_username
				+ ", kind_name=" + kind_name + ", user=" + user + "]";
	}
	public KindArticle(int id, String user_username, String kind_name, User user) {
		super();
		this.id = id;
		this.user_username = user_username;
		this.kind_name = kind_name;
		this.user = user;
	}
	public KindArticle() {
		super();
		// TODO Auto-generated constructor stub
	}
}
