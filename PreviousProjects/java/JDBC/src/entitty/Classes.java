package entitty;

public class Classes {
	private   int   cid;
	private   String   cname;
	private   int    cnum;
	
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(int cid, String cname, int cnum) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cnum = cnum;
	}
	@Override
	public String toString() {
		return "classes [cid=" + cid + ", cname=" + cname + ", cnum=" + cnum + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
}
