package Function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import enttity1.Student;

public class Dostudent {
	public Dostudent()
	{
		
	}
	public  void  add_student(Student s) throws Exception
	{
		//连接数据库
		Connection  con=DB.getconnection();
		String sql="insert student(username, password,sex,birthday,number,classs,password1,remarks,system,course)  values(?,?,?,?,?,?,?,?,?,?)";
		//预编译SQL语句，当调用语句的时候才会真的执行
		PreparedStatement p=con.prepareStatement(sql);
		//预备编译SQL语句
		p.setString(1,s.getUsername() );
		p.setString(2,s.getPassword() );
		p.setString(3,s.getSex() );
		p.setString(4,s.getBirthday() );
		p.setString(5,s.getNumber());
		p.setString(6,s.getClasss());
		p.setString(7,s.getPassword1() );
		p.setString(8,s.getRemarks());
		p.setString(9,s.getSystem());
		p.setString(10,s.getCourse());
		//执行
		p.execute();	
	}
	public List<Student> getnumber() throws Exception
	{
		Connection con=DB.getconnection();
		String sql="select number from  student";
		Statement s1=con.createStatement();
		ResultSet r=s1.executeQuery(sql);
		Student s=null;
		List<Student> l=new ArrayList<Student>();
		while(r.next())
		{
			s.setNumber(r.getString("number"));
			l.add(s);
		}
		return l;
	}
}
