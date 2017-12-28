package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Department;
import com.dao.DepartmentMapper;
/**
 * 测试Dao层的工作
 * 推荐spring的项目使用spring的单元测试，自动注入需要的组件
 * 导入springTest模块
 * @author JinDaShuai
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	DepartmentMapper departmentMapper;
	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD(){
	//原始测试方式：	
		//创建springIOC容器ionContext
		//ApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//从容器中得到mapper
		//DepartmentMapper departmentMapper=(DepartmentMapper) ioc.getBean("departmentMapper");
    //spring的单元测试方式：
		System.out.println(departmentMapper);
	}
}
