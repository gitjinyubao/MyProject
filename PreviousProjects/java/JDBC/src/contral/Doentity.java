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
			System.out.println("�˰༶�Ѿ�����,�˴β�ִ�в���");
		}
		else
		{
				String   sql   ="insert   classes     values(?,?,?)";
				PreparedStatement  p=  con1.prepareStatement(sql);
				p.setInt(1,c.getCid());
				p.setString(2, c.getCname());
				p.setInt(3, c.getCnum());
				p.executeUpdate();
				System.out.println("�˰༶��Ϣ¼�����");
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
			System.out.println("�Ѿ����༶���Ϊ"+id1+"ɾ��");
		}
		else
		{
			System.out.println("�˰༶������,�˴β�ִ��ɾ��");
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
			System.out.println("�Ѿ����༶���Ϊ"+id1+"����");
		}
		else
		{
			System.out.println("�˰༶������,�˴β�ִ�и���");
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
			System.out.println("�˰༶������,�˴β�ִ�в�ѯ");
		}
		Jdbc.close(p1, r);
		return  c; 
	}
}
