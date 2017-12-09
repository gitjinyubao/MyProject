package contral;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Jdbc;
import entitty.Classes;

public class Doentity {
	public  static void  addclass(Classes   c) throws SQLException
	{
		Connection  con1=Jdbc.getcon();
		String  sql1="select  *   from   classes  where  cid=?";
		PreparedStatement  p1=con1.prepareStatement(sql1);
		p1.setInt(1, c.getCid());
		ResultSet r=p1.executeQuery();
		if(r.next())
		{
			System.out.println("此班级已经存在,此次不执行插入");
		}
		else
		{
				String   sql   ="insert   classes     values(?,?,?)";
				PreparedStatement  p=  con1.prepareStatement(sql);
				p.setInt(1,c.getCid());
				p.setString(2, c.getCname());
				p.setInt(3, c.getCnum());
				p.executeUpdate();
				System.out.println("此班级信息录入完毕");
				Jdbc.close(p);
		}
		Jdbc.close(p1, r);
	}
	public  static   void   deleteClasses(int   id1) throws SQLException
	{
		Connection  con1=Jdbc.getcon();
		String  sql1="select  *   from   classes  where  cid=?";
		PreparedStatement  p1=con1.prepareStatement(sql1);
		p1.setInt(1, id1);
		ResultSet r=p1.executeQuery();
		if(r.next())
		{
			String   sql   ="delete  from classes  where   cid=?";
			PreparedStatement  p=  con1.prepareStatement(sql);
			p.setInt(1,id1);
			p.executeUpdate();
			Jdbc.close(p);
			System.out.println("已经将班级编号为"+id1+"删除");
		}
		else
		{
			System.out.println("此班级不存在,此次不执行删除");
		}
		Jdbc.close(p1, r);
	}
	public   static   void  updateClasses(Classes   c,int id1) throws SQLException
	{
		Connection  con1=Jdbc.getcon();
		String  sql1="select  *   from   classes  where  cid=?";
		PreparedStatement  p1=con1.prepareStatement(sql1);
		p1.setInt(1, id1);
		ResultSet r=p1.executeQuery();
		if(r.next())
		{
			String   sql   ="update  classes   set  cid=?,cname=?,cnum=? where  cid=?";
			PreparedStatement  p=  con1.prepareStatement(sql);
			p.setInt(1,c.getCid());
			p.setString(2, c.getCname());
			p.setInt(3, c.getCnum());
			p.setInt(4, id1);
			p.executeUpdate();
			Jdbc.close(p);
			System.out.println("已经将班级编号为"+id1+"更改");
		}
		else
		{
			System.out.println("此班级不存在,此次不执行更改");
		}
		Jdbc.close(p1, r);
	}
	public   static   Classes  queryClasses(int   id1) throws SQLException
	{
		Classes   c=new Classes();
		Connection  con1=Jdbc.getcon();
		String  sql1="select  *   from   classes  where  cid=?";
		PreparedStatement  p1=con1.prepareStatement(sql1);
		p1.setInt(1, id1);
		ResultSet r=p1.executeQuery();
		if(r.next())
		{
			c.setCid(r.getInt("cid"));
			c.setCname(r.getString("cname"));
			c.setCnum(r.getInt("cnum"));		
		}
		else
		{
			System.out.println("此班级不存在,此次不执行查询");
		}
		Jdbc.close(p1, r);
		return  c; 
	}
}
