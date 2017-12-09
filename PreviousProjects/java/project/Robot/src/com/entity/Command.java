package com.entity;

import java.util.List;

public class Command {
	private int id;
	
	private String name;
	
	private String description;
	
	private List<CommandContent> list;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<CommandContent> getList() {
		return list;
	}

	public void setList(List<CommandContent> list) {
		this.list = list;
	}

	public Command(int id, String name, String description,
			List<CommandContent> list) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.list = list;
	}

	public Command() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Command [id=" + id + ", name=" + name + ", description="
				+ description + ", list=" + list + "]";
	}
}
