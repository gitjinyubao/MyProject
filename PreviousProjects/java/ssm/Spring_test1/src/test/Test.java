package test;

public class Test {
	private  int   id;
	private  String   name;
	private  Boolean   select;
	private  char       sex;
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
	public Boolean getSelect() {
		return select;
	}
	public void setSelect(Boolean select) {
		this.select = select;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	
	public  void  init()
	{
		//init()方法用于对数据初始化，可以解决注入后对属性的继续更改
		this.setId(1);
		this.setName("jin");
		this.setSelect(true);
		this.setSex('男');
		//如果使用其本身再创造出一个对象，那么就不是同一个对象对属性设值了
		//this是指当前对象
	}
	@Override
	public String toString(){
		return "Test [id=" + id + ", name=" + name + ", select=" + select
				+ ", sex=" + sex + "]";
	}
}
