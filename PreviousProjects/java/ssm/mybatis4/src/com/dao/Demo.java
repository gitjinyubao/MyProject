package com.dao;

import com.dao.impl.PeopleDaoImpl;
import com.entity.Wife;
import com.entity.Huspand;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleDaoImpl   peopleDao=new PeopleDaoImpl();
//		Huspand  huspand=new Huspand();
//		
//		huspand=userDao.findById(2);
//		System.out.println(huspand.toString());
//		System.out.println(huspand.getWife().getW_name());
		
		
		Wife wife= peopleDao.findById1(1);
		System.out.println(wife.toString());		
		System.out.println(wife.getHuspand().getH_name());
		
		
		
		Huspand  huspand=peopleDao.findById(1);
		System.out.println(huspand.toString());
		
	}
}
