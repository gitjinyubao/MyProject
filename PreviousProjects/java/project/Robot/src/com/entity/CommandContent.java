package com.entity;

public class CommandContent {
	private int id;
	
	private String content;
	
	private int command_id;
	
	private Command command;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCommand_id() {
		return command_id;
	}

	public void setCommand_id(int command_id) {
		this.command_id = command_id;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public CommandContent(int id, String content, int command_id,
			Command command) {
		super();
		this.id = id;
		this.content = content;
		this.command_id = command_id;
		this.command = command;
	}

	public CommandContent() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CommandContent [id=" + id + ", content=" + content
				+ ", command_id=" + command_id + ", command=" + command + "]";
	}
}
