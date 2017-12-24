package com.sunny.demo.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sunny.demo.bean.Cat;
import com.sunny.demo.repository.Cat2Repository;
import com.sunny.demo.repository.CatPagingRepositor;
import com.sunny.demo.repository.CatRepository;

/**
 * save, update, delete, 方法需要事物绑定
 * 
 * 使用@Transactional进行事物绑定
 * 
 * @param cat
 * 
 * @author JinDaShuai
 *
 */
@Service
public class CatService {
	// save和delete是需要进行事物绑定的，使用的是transitonal
	@Resource
	private CatRepository catRepository;
	@Resource
	private Cat2Repository cat2Repository;
	@Resource
	private  CatPagingRepositor catPagingRepositor;
	
	// 保存数据
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	// 删除数据
	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}
	
	// 查询数据
	public List<Cat> getAll() {
		return (List<Cat>) catRepository.findAll();
	}
	
	// 存在性
	public boolean judgeCat(int id) {
		return catRepository.exists(id);
	}
	
	// 删除所有
	public void deleteAll() {
		catRepository.deleteAll();
	}
	
	// 根据姓名查询
	public Cat findCatByCatName(String catName) {
		return cat2Repository.findByCatName(catName);
	}
	
	// 根据姓名查询
	public Cat findCatByCatName2(String catName) {
		return cat2Repository.findByCatName(catName);
	}
	
	// 《《《《《《《《《《《《《《《《分页
	// 分页查询
	public Page<Cat> findCats(Pageable pageable) {
		return catPagingRepositor.findAll(pageable);
	}
	
	// 排序（ID）
	public List<Cat> getCats(Sort sort){
		return (List<Cat>) catPagingRepositor.findAll(sort);
	}
}
