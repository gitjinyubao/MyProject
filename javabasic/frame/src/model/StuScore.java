package model;

public class StuScore {
	private int id;
	private String name;
	private String sex;
	private String stunumber;
	private String subject;
	private int score;
	
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
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "StuScore [id=" + id + ", name=" + name + ", sex=" + sex + ", stunumber=" + stunumber + ", subject="
				+ subject + ", score=" + score + "]";
	}
}
