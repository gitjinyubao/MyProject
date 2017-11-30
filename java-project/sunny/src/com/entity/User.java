package com.entity;

import java.util.List;

public class User {
	private   int    id;
	private   String   username;
	private   String   password;
	private   String   nickname;
	private   String   question;
	private   String   answer;
	private   List<Character>   list_character;
	private   List<Article>     list_article;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public List<Character> getList_character() {
		return list_character;
	}
	public void setList_character(List<Character> list_character) {
		this.list_character = list_character;
	}
	public List<Article> getList_article() {
		return list_article;
	}
	public void setList_article(List<Article> list_article) {
		this.list_article = list_article;
	}
	public User(int id, String username, String password, String nickname,
			String question, String answer) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.question = question;
		this.answer = answer;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", nickname=" + nickname + ", question="
				+ question + ", answer=" + answer + ", list_character="
				+ list_character + ", list_article=" + list_article + "]";
	}
}
