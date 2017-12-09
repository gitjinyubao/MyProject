package com.entity;

public class Huspand {
	private  int id;
	private  String  h_name;
	private  Wife   wife;
	public Huspand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Huspand(int id, String h_name, Wife wife) {
		super();
		this.id = id;
		this.h_name = h_name;
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Huspand [id=" + id + ", h_name=" + h_name + ", wife=" + wife
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
}
