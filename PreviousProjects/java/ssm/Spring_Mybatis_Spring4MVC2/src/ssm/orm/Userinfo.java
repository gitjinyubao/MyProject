package ssm.orm;

import java.util.Date;
//orm映射；对象关系映射(orm映射)实体类与数据库表一一映射
public class Userinfo {

	private   long   id;
	private   String  password;
	private   int     age;
	private   Date    insertdate;
	public Userinfo(long id, String password, int age, Date insertdate) {
		super();
		this.id = id;
		this.password = password;
		this.age = age;
		this.insertdate = insertdate;
	}
	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}
}
