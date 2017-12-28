package com.entity;

public class Comment {
	private   int          id;
	private   String       content;
	private   String       username;
	private   int          article_id;
	private   String       user_nickname;
	private   Article      article;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Comment(int id, String content, String username, int article_id,
			String user_nickname, Article article) {
		super();
		this.id = id;
		this.content = content;
		this.username = username;
		this.article_id = article_id;
		this.user_nickname = user_nickname;
		this.article = article;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", username="
				+ username + ", article_id=" + article_id + ", user_nickname="
				+ user_nickname + ", article=" + article + "]";
	}
}
