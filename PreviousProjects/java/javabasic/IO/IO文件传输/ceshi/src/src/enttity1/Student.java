package enttity1;

public class Student {
	private String username;
	private String password;
	private String sex;
	private String birthday;
	private String number;
	private String classs;
	private String password1;
	private String remarks;
	private String system;
	private String system1;
	private String course;	
	public Student()
	{
		
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
//		if(system1=="软件工程")
//		{
//			this.system="软件工程";
//		}
//		else if(system1=="计算机科学")
//		{
//			this.system="计算机科学";
//		}
//		else if(system1=="网络工程")
//		{
//			this.system="网络工程";
//		}
//		else if(system1=="数字媒体")
//		{
//			this.system="数字媒体";
//		}
		this.system=system;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
