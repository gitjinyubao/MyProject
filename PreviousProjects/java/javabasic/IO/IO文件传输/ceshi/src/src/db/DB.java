package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DB {
	private   static final String  url="jdbc:mysql://127.0.0.1:3306/project";
	private   static final String  password="1934jy26";
	private   static final String  user="root";
	
	static
	{
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  static Connection getconnection() throws Exception 
	{
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("数据库链接正常");
			System.out.println(con);
		return con;
	}
}
