package com.entity;

import java.sql.Timestamp;
import java.util.List;



public class Article {
	private    int   id;
	private    String   title;
	private    String   content;
	private    String   user_username;
	private    Timestamp    date;
	private    int      replynumber;
	private    String   kind_name;
	private    List<Click>    list_click;
	private    List<Comment>  list_comment;
	private    User           user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getReplynumber() {
		return replynumber;
	}
	public void setReplynumber(int replynumber) {
		this.replynumber = replynumber;
	}
	public String getKind_name() {
		return kind_name;
	}
	public void setKind_name(String kind_name) {
		this.kind_name = kind_name;
	}
	public List<Click> getList_click() {
		return list_click;
	}
	public void setList_click(List<Click> list_click) {
		this.list_click = list_click;
	}
	public List<Comment> getList_comment() {
		return list_comment;
	}
	public void setList_comment(List<Comment> list_comment) {
		this.list_comment = list_comment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content="
				+ content + ", user_username=" + user_username + ", date="
				+ date + ", replynumber=" + replynumber + ", kind_name="
				+ kind_name + ", list_click=" + list_click + ", list_comment="
				+ list_comment + ", user=" + user + "]";
	}
	public Article(int id, String title, String content, String user_username,
			Timestamp date, int replynumber, String kind_name,
			List<Click> list_click, List<Comment> list_comment, User user) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.user_username = user_username;
		this.date = date;
		this.replynumber = replynumber;
		this.kind_name = kind_name;
		this.list_click = list_click;
		this.list_comment = list_comment;
		this.user = user;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
}
