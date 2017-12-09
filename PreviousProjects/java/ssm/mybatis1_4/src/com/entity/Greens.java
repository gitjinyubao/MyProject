package com.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Greens {
	private   int   id;
	private   String   name;
	private   List<Plate>   list;
	private   List<Material>   list1;
	
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
	
	public Greens() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Greens [id=" + id + ", name=" + name + ", list=" + list
				+ ", list1=" + list1 + "]";
	}
	public List<Plate> getList() {
		return list;
	}
	public void setList(List<Plate> list) {
		this.list = list;
	}
	public List<Material> getList1() {
		return list1;
	}
	public void setList1(List<Material> list1) {
		this.list1 = list1;
	}
	public Greens(int id, String name, List<Plate> list, List<Material> list1) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.list1 = list1;
	}
}
