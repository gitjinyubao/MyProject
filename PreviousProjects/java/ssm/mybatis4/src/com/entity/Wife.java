package com.entity;

import java.util.List;

public class Wife {
private   int  id;
private   String w_name;
private   Huspand   huspand;
public Wife(int id, String w_name, Huspand huspand) {
	super();
	this.id = id;
	this.w_name = w_name;
	this.huspand = huspand;
}
public Wife() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Wife [id=" + id + ", w_name=" + w_name + ", huspand=" + huspand
			+ "]";
}
public void setId(int id) {
	this.id = id;
}
public String getW_name() {
	return w_name;
}
public void setW_name(String w_name) {
	this.w_name = w_name;
}
public Huspand getHuspand() {
	return huspand;
}
public void setHuspand(Huspand huspand) {
	this.huspand = huspand;
}


}