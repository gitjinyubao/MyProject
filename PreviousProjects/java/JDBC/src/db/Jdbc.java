package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc {
	private     static    Connection    con=null;  
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","1934jy26");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  static  Connection   getcon()
	{
		return  con;
	}
	public  static  void  close(Statement   s) throws SQLException
	{
		if(s!=null)
		{
			s.close();
		}
	}
	public  static  void  close(Statement   s,ResultSet  r) throws SQLException
	{
		if(s!=null&&r!=null)
		{
			s.close();
			r.close();
		}
	}
}
