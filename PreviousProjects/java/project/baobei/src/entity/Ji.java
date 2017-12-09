package entity;

public class Ji {
	private   int   money;
	private   String   explain;
	private   String   time;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	
	public Ji(int money, String explain, String time) {
		super();
		this.money = money;
		this.explain = explain;
		this.time = time;
	}
	public Ji() {
		super();
		// TODO Auto-generated constructor stub
	}
}
