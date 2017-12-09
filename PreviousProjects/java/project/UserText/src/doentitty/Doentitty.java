package doentitty;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entitty.Jdbc;
import entitty.User;
public class Doentitty {
	//列出所有的用户
	public   static  List<User>    ListUser() 
	{
		List<User>   list=new ArrayList<User>();
		User  user=null;
		String   sql="select  * from  tbl_user";
		PreparedStatement p;
		try {
			p = Jdbc.getcon().prepareStatement(sql);
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				user=new User(r.getString("username"),r.getString("password"),r.getString("age"),r.getInt("id"));
	            list.add(user);	
			}
			Jdbc.close1(p, r);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//判断用户登录
	public  static  User   Luogin(String  username,String  password) 
	{
		try {
			
			String sql="select    *  from   tbl_user   where   username=? and   password=?";
			PreparedStatement  p=Jdbc.getcon().prepareStatement(sql);
			p.setString(1, username);
			p.setString(2, password);
			ResultSet  r=p.executeQuery();
			
			if(r.next())
			{
				User user=new User(r.getString("username"),r.getString("password"),r.getString("age"),r.getInt("id"));
				Jdbc.close1(p, r);
				return user;
			}
			else
			{
			
				User   user=null;
				Jdbc.close1(p, r);
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	//删除用户
	public    static  void  deleteUser(int id) 
	{
		try {
			String sql="delete   from   tbl_user   where   id=?";
			PreparedStatement  p=Jdbc.getcon().prepareStatement(sql);
			p.setInt(1, id);
			p.executeUpdate();
			Jdbc.close1(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//更改用户信息
	public    static  int updateUser(User user) 
	{
		try {
			String sql="update   tbl_user set username=?,password=?,age=? where   id=?";
			PreparedStatement p;
			p = Jdbc.getcon().prepareStatement(sql);
			p.setString(1, user.getUsername());
			p.setString(2, user.getPassword());
			p.setString(3, user.getAge());
			p.setInt(4, user.getId());
			p.executeUpdate();
			Jdbc.close1(p);
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	//查询一个用户
	public  static  User  FindUser(int id) 
	{
		try {
			String sql="select    *  from   tbl_user   where id=?  ";
			PreparedStatement p;
			p = Jdbc.getcon().prepareStatement(sql);
			p.setInt(1, id);
			ResultSet r=p.executeQuery();
			User user=null;
			if(r.next())
			{
				user=new User(r.getString("username"),r.getString("password"),r.getString("age"),r.getInt("id"));
				return user;
			}
			Jdbc.close1(p, r);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//添加新用户
	public    static  void  insert(User user)
	{
		try {
			String sql="insert into  tbl_user(username,password,age) values(?,?,?)";
			PreparedStatement p;
			p = Jdbc.getcon().prepareStatement(sql);
			p.setString(1, user.getUsername());
			p.setString(2, user.getPassword());
			p.setString(3, user.getAge());
			p.executeUpdate();
			Jdbc.close1(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//模糊查询
	public  static  List<User>  blurFind1(String username,int CurrentPage,int PageSize) 
	{
		try {
			List<User>   list=new ArrayList<User>();
			String sql="select    *  from   tbl_user   where username  like  ? limit ?,? ";
			int start=(CurrentPage-1)*PageSize;
			PreparedStatement p;
			p = Jdbc.getcon().prepareStatement(sql);
			p.setString(1, "%"+username.trim()+"%");
			//username.trim():去除username在文本框中左右的空格
			p.setInt(2, start);
			p.setInt(3, PageSize);
			ResultSet r=p.executeQuery();
			User user=null;
			while(r.next())
			{
				
				user=new User(r.getString("username"),r.getString("password"),r.getString("age"),r.getInt("id"));
				list.add(user);
			}
			Jdbc.close1(p, r);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return null;
	}
	
	//查询用户总数
	public  static  int   sumUser()
	{
		int sumUser = 0;
		String sql="select   count(1)  from   tbl_user  ";
		PreparedStatement p;
		try {
			p = Jdbc.getcon().prepareStatement(sql);
			ResultSet r=p.executeQuery();
			if(r.next())
			{
				sumUser=r.getInt(1);
				return sumUser;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sumUser;
	}
	public   static  List<User>    ListUser1(int CurrentPage,int PageSize) 
	{
		List<User>   list=new ArrayList<User>();
		User  user=null;
		int start=(CurrentPage-1)*PageSize;
		String   sql="select  * from  tbl_user limit  ?,?";
		PreparedStatement p;
		try {
			p = Jdbc.getcon().prepareStatement(sql);
			p.setInt(1, start);
			p.setInt(2, PageSize);
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				user=new User(r.getString("username"),r.getString("password"),r.getString("age"),r.getInt("id"));
	            list.add(user);	
			}
			Jdbc.close1(p, r);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}