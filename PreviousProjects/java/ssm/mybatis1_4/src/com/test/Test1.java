package com.test;

import org.apache.ibatis.session.SqlSession;

import com.dao.GreensDao;
import com.dao.MaterialDao;
import com.dao.PlateDao;
import com.entity.Greens;
import com.entity.Material;
import com.entity.Plate;

public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("对于Plate(盘子)");
		SqlSession   sqlSession1=TestProject.getSqlSession();
		//获得接口的代理对象
		PlateDao   pd=sqlSession1.getMapper(PlateDao.class);
		Plate   plate=pd.getPlateById(2);
		System.out.println(plate.toString());
		sqlSession1.close();
		
		
		System.out.println("--------------");
		System.out.println("对于Material(食材)");
		SqlSession   sqlSession2=TestProject.getSqlSession();
		//获得接口的代理对象
		MaterialDao   md=sqlSession2.getMapper(MaterialDao.class);
		Material   m=md.getMaterialById(2);
		System.out.println(m.toString());
		sqlSession2.close();
		
		
		System.out.println("--------------");
		System.out.println("对于Greens(菜品)");
		SqlSession   sqlSession3=TestProject.getSqlSession();
		//获得接口的代理对象
		GreensDao   gd=sqlSession3.getMapper(GreensDao.class);
		Greens      g=gd.getGreensById(3);
		System.out.println(g.toString());
		sqlSession3.close();
	}
}
