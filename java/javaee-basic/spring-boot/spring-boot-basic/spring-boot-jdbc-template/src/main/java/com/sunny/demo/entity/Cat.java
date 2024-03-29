package com.sunny.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建了一个实体类。
 * 
 * 如何持久化？
 * 
 * 使用@Entity进行实体类的持久化操作，当jpa检测到我们的实体类当中有
 * 
 * @Entity 注解的时候，就会在数据库中生成对应的表结构信息。
 * 
 *         如何指定主键及主键的生成策略？
 * 
 *         2.使用@Id指定主键。
 * 
 * @author JinDaShuai
 *
 */
@Entity
public class Cat {
	/**
	 * 使用@Id指定主键.
	 * 
	 * 使用@GeneratedValue(strategy=GenerationType.AUTO) 指定主键的生成策略。mysql默认的是自增长.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; // 主键.
	private String catName; // 姓名. cat_name
	private String catAge; // 年龄. cat_age(数据库生成名字)

	public Cat() {
		super();
	}
	
	public Cat(String catName, String catAge) {
		super();
		this.catName = catName;
		this.catAge = catAge;
	}

	public Cat(int id, String catName, String catAge) {
		super();
		this.id = id;
		this.catName = catName;
		this.catAge = catAge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatAge() {
		return catAge;
	}

	public void setCatAge(String catAge) {
		this.catAge = catAge;
	}
}
