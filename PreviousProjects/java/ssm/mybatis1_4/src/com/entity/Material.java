package com.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Material {
	private   int   id;
	private   String   name;
	private   List<Greens>   list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Greens> getList() {
		return list;
	}
	public void setList(List<Greens> list) {
		this.list = list;
	}
	
	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Material(int id, String name, List<Greens> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		
	}
	@Override
	public String toString() {
		return "Material [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
}
