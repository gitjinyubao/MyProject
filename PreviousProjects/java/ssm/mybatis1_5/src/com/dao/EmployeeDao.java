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
	
	/*list��������Ա�������ö������ͽ���������eg��Integer ��һ���ࣨ��int�ķ�װ�ࣩ  
	  int:������������    ���Դ˴�ʹ��Integer��*/
	public   List<Employee>   getListEmployeeByListId(List<Integer>   list);
	//ģ����ѯ��bind
	public   List<Employee>   getListEmployeeBind(Employee  employee);
}
