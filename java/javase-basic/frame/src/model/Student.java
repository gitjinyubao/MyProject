package model;

public class Student {
	
	private int id;
	private String name;
	private String sex;
	private String stunumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStunumber() {
		return stunumber;
	}
	public void setStunumber(String stunumber) {
		this.stunumber = stunumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", stunumber=" + stunumber + "]";
	}
}
