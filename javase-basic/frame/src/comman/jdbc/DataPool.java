package comman.jdbc;

import java.sql.Connection;
import java.util.LinkedList;

import utils.ConstantUtil;
import utils.DBUtil;
import utils.LoadPropertiesUtil;

/*
 * 通过实现DataSource来构建自己的数据库连接池
 */
public class DataPool {
	
	// 采用Linkedlist来作为存储数据库连接的集合：第测测你给数据结是链表，便于移除以及添加
	private static LinkedList<Connection> pool = new LinkedList<Connection>();
	
	static {
		try {	
			int maxConNum = Integer.parseInt(LoadPropertiesUtil.getPropertiesInfo(ConstantUtil.JDBC_PROPERTY_PATH).get("maxNum"));
			for (int i = 0; i < maxConNum; i++) {
				Connection con = DBUtil.getCon(); //得到一个连接
				DataPool.pool.add(con);
			}
		} catch(Exception e) {
			throw new ExceptionInInitializerError("数据库连接失败，请检查配置");
		}
	}
	
	// 从池中得到一个连接
	public static Connection getConFromPool() {
		if (!pool.isEmpty()) {
			return DataPool.pool.removeFirst();
		} else {
			return null;
		}
	}
	
	// 释放资源
	public static void release(Connection con){
		if (con != null) {
			DataPool.pool.addLast(con);
		}
	}
}
