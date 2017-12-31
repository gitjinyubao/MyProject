package com.sunny.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunny.demo.dao.CatDao;
import com.sunny.demo.entity.Cat;

@Service
public class CatService {
	@Resource
	private CatDao catDao;
	
	public Cat selectByCatName(String catName) {
		return catDao.selectByCatName(catName);
	}
}
