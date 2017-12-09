package com.entitty;

public class User {
	private  int  id;
	private String  username;
	private String  password;
	private int    account1;
	public User(int id, String username, String password, int account1) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.account1 = account1;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccount1() {
		return account1;
	}
	public void setAccount1(int account1) {
		this.account1 = account1;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", account1=" + account1 + "]";
	}
}
