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
		//init()�������ڶ����ݳ�ʼ�������Խ��ע�������Եļ�������
		this.setId(1);
		this.setName("jin");
		this.setSelect(true);
		this.setSex('��');
		//���ʹ���䱾���ٴ����һ��������ô�Ͳ���ͬһ�������������ֵ��
		//this��ָ��ǰ����
	}
	@Override
	public String toString(){
		return "Test [id=" + id + ", name=" + name + ", select=" + select
				+ ", sex=" + sex + "]";
	}
}
