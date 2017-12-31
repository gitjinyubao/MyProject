package com.sunny.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.demo.entity.Cat;
import com.sunny.demo.service.CatService;

@RestController
@RequestMapping("cat")
public class Controller {
	@Resource
	private CatService catService;
	
	@RequestMapping("selectByCatName")
	public Cat selectByCatName(String catName) {
		return catService.selectByCatName(catName);
	}
}
