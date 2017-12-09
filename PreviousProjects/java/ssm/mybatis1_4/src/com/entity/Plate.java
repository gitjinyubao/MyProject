package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Plate {
	private  int   id;
	private  String color;
	private  Greens  greens;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Greens getGreens() {
		return greens;
	}
	public void setGreens(Greens greens) {
		this.greens = greens;
	}
	public Plate(int id, String color, Greens greens) {
		super();
		this.id = id;
		this.color = color;
		this.greens = greens;
	}
	public Plate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Plate [id=" + id + ", color=" + color + ", greens=" + greens
				+ "]";
	}  
}
