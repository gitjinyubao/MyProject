package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	private static  Connection  con=null;
	static 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project5?characterEncoding=utf8&useSSL=false&autoReconnect=true","root","1934jy26");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getcon()
	{
		return con;
	}
	public   static void close1(Statement  s,ResultSet  r) throws SQLException
	{
		if(r!=null)
		{
			r.close();
		}
		if(s!=null)
		{
			s.close();
		}
	}
	public   static void   close1(Statement  s) throws SQLException
	{
		if(s!=null)
		{
			s.close();
		}
	}
}
