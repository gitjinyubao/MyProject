package com.sunny.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.sunny.demo.bean.Cat;

// 很少用这种方法
public interface Cat2Repository extends Repository<Cat, Integer> {
	/**
	 * 1.查询方法以get | find | read开头。
	 * 2.涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写。
	 */
	
	
	// 根据catName进行查询(条件catName)
	public Cat findByCatName(String catName);
	
	/**
	 * 如何编写JPOQL语句
	 * Hibernate -- HQL语句
	 * JPQL语句和HQL语句类似。
	 */
	@Query("from Cat where catName=:catName")
	public Cat findMyCatByName(String catName);
	
	/*@Query("from Cat where catName=:cn")
	public Cat findMyCatName(@Param("cn")String catName);*/
}
