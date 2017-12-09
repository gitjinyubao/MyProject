package com.entity;

import java.util.List;

public class Role {
private   int  id;
private   String rolenumber;
private   String name;
private   List<User>   users;
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public Role(int id, String rolenumber, String name) {
	super();
	this.id = id;
	this.rolenumber = rolenumber;
	this.name = name;
}
public Role(int id, String rolenumber, String name, List<User> users) {
	super();
	this.id = id;
	this.rolenumber = rolenumber;
	this.name = name;
	this.users = users;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRolenumber() {
	return rolenumber;
}
public void setRolenumber(String rolenumber) {
	this.rolenumber = rolenumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Role [id=" + id + ", rolenumber=" + rolenumber + ", name=" + name
			+ "]";
}
}