package com.sunny.parse;

public class Book {
	private String author;
	private String price;
	private String name;

	public Book() {
		super();
	}

	public Book(String author, String price, String name) {
		super();
		this.author = author;
		this.price = price;
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + ", name=" + name + "]";
	}
}
