package com.sunny.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.sunny.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{

}
