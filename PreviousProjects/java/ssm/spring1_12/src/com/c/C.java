package com.c;

public class C {
	private   String   url;
	private   String   username;
	private   String   password;
	private   String   driverClassName;
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	@Override
	public String toString() {
		return "C [url=" + url + ", username=" + username + ", password="
				+ password + ", driverClassName=" + driverClassName + "]";
	}
	
	
}
