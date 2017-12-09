package com.entity;
/*
 * 与消息对应的实体类
 */
public class Message {
	/*
	 * 主键
	 */
	private   int  id;
	/*
	 * 指令
	 */
	private   String    command;
	/*
	 *描述
	 */
	private   String    description;
	/*
	 *内容
	 */
	private   String    content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message(int id, String command, String description, String content) {
		super();
		this.id = id;
		this.command = command;
		this.description = description;
		this.content = content;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", command=" + command + ", description="
				+ description + ", content=" + content + "]";
	}
    
}
