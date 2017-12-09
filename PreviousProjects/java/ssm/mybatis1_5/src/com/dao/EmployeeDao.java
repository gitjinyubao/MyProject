package com.dao;

import java.util.HashMap;
import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {
	public   Employee   getEmployeeById(int   id);
	public   void       insertEmployee(Employee  employee);
	public   void       deleteEmployeeById(int id);
	public   void       updateEmployeeById(Employee  employee);
	public   void       updateEmployeeSet(Employee  employee);
	public   List<Employee>   getListEmployeeById(HashMap<String, Object>   params);
	public   List<Employee>   getListEmployee(HashMap<String, Object>   params);
	public   List<Employee>   getListEmployeeWhere(HashMap<String, Object>   params);
	
	/*list中声明成员类型是用对象类型进行声明（eg：Integer 是一个类（对int的封装类）  
	  int:基本数据类型    所以此处使用Integer）*/
	public   List<Employee>   getListEmployeeByListId(List<Integer>   list);
	//模糊查询：bind
	public   List<Employee>   getListEmployeeBind(Employee  employee);
}
