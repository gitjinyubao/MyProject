package com.entity;

import java.util.Date;

public class Click {
	private    int   id;
	private    Date  time;
	private    int   article_id;
	public Click(int id, Date time, int article_id) {
		super();
		this.id = id;
		this.time = time;
		this.article_id = article_id;
	}
	public Click() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	@Override
	public String toString() {
		return "Click [id=" + id + ", time=" + time + ", article_id="
				+ article_id + "]";
	}
}
