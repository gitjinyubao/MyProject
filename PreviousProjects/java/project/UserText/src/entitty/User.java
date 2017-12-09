package entitty;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements  HttpSessionBindingListener {
	private String username;
	private String password;
	private String age;
	private int id;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String age, int id) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.id = id;
	}
	public User(String username, String password, String age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		CountUser.USER_COUNt++;
		//user对象放进session对象时，自动进入此方法
	}
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		CountUser.USER_COUNt--;
		//user对象从session对象解放时（session失效或者超时），自动进入此方法
	}
	
}