package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("查询员工(id)");
		SqlSession   sqlSession=TestProject.getSqlSession();
		EmployeeDao  ed=sqlSession.getMapper(EmployeeDao.class);
		Employee     el=ed.getEmployeeById(2);
		System.out.println(el.toString());
		
		
		/*System.out.println("------------");
		System.out.println("插入员工(Employee)");
		SqlSession   sqlSession1=TestProject.getSqlSession();
		Employee    el1=new   Employee("cheng","女");
		EmployeeDao  ed1=sqlSession1.getMapper(EmployeeDao.class);
		ed1.insertEmployee(el1);
		sqlSession1.commit();
		sqlSession1.close();*/
		
		
		
		System.out.println("------------");
		System.out.println("删除员工(id)");
		SqlSession   sqlSession2=TestProject.getSqlSession();
		EmployeeDao  ed2=sqlSession2.getMapper(EmployeeDao.class);
		ed2.deleteEmployeeById(1);
		sqlSession2.commit();
		sqlSession2.close();
		
		
		
		System.out.println("------------");
		System.out.println("修改员工(id)");
		SqlSession   sqlSession3=TestProject.getSqlSession();
		EmployeeDao  ed3=sqlSession3.getMapper(EmployeeDao.class);
		Employee    el2=new   Employee(2,"chengfang","女");
		ed3.updateEmployeeById(el2);
		sqlSession3.commit();
		sqlSession3.close();
		
		
		System.out.println("------------");
		System.out.println("HashMap传参数查询员工(/id)");
		SqlSession   sqlSession4=TestProject.getSqlSession();
		EmployeeDao  ed4=sqlSession4.getMapper(EmployeeDao.class);
		HashMap<String, Object>  params =new HashMap<String, Object>();
		/*params.put("id", 5);
		params.put("name", "zhang");*/
		List<Employee>   list1=ed4.getListEmployeeById(params);
		for (Employee employee : list1) {
			System.out.println(employee.toString());
		}
		sqlSession4.commit();
		sqlSession4.close();
		
		System.out.println("------------");
		System.out.println("HashMap传参数查询员工");
		SqlSession   sqlSession5=TestProject.getSqlSession();
		EmployeeDao  ed5=sqlSession5.getMapper(EmployeeDao.class);
		HashMap<String, Object>  params1 =new HashMap<String, Object>();
		//params1.put("id", 6);
		params1.put("name", "zhang");
		params1.put("sex", "女");
		List<Employee>   list2=ed5.getListEmployee(params1);
		for (Employee employee : list2) {
			System.out.println(employee.toString());
		}
		sqlSession5.commit();
		sqlSession5.close();
		

		System.out.println("------------");
		System.out.println("HashMap传参数查询员工");
		SqlSession   sqlSession6=TestProject.getSqlSession();
		EmployeeDao  ed6=sqlSession6.getMapper(EmployeeDao.class);
		HashMap<String, Object>  params2 =new HashMap<String, Object>();
		//params2.put("id", 6);
		params2.put("name", "zhang");
		params2.put("sex", "女");
		List<Employee>   list3=ed6.getListEmployeeWhere(params2);
		for (Employee employee : list3) {
			System.out.println(employee.toString());
		}
		sqlSession6.commit();
		sqlSession6.close();
		
		
		System.out.println("------------");
		System.out.println("动态修改员工(Employee)");
		SqlSession   sqlSession7=TestProject.getSqlSession();
		Employee    el7=new   Employee(2,"chengjiang","女");
		EmployeeDao  ed7=sqlSession7.getMapper(EmployeeDao.class);
		ed7.updateEmployeeSet(el7);
		sqlSession7.commit();
		sqlSession7.close();
		
		
		
		System.out.println("------------");
		//foreach：动态sql参数集合遍历
		System.out.println("查询员工，动态sql参数集合遍历(id)");
		SqlSession   sqlSession8=TestProject.getSqlSession();
		EmployeeDao  ed8=sqlSession8.getMapper(EmployeeDao.class);
		//使用ArrayList进行初始化
		List<Integer>   list=new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(3);
		List<Employee>   list5=ed8.getListEmployeeByListId(list);
		for (Employee employee : list5) {
			System.out.println(employee.toString());
		}
		sqlSession8.close();
		
		
		
		System.out.println("------------");
		System.out.println("模糊查询员工bind(id)");
		SqlSession   sqlSession9=TestProject.getSqlSession();
		EmployeeDao  ed9=sqlSession9.getMapper(EmployeeDao.class);
		Employee     el9=new   Employee();
		el9.setName("n");
		List<Employee>  list9=ed9.getListEmployeeBind(el9);
		for (Employee employee : list9) {
			System.out.println(employee.toString());
		}
		sqlSession9.close();
	}
}
