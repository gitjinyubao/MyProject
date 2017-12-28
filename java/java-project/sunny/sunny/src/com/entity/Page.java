package com.entity;

public class Page {
	private   int   start1;
	private   int   pageSum;
	private   String  handle;
	private   int     pageCurrent;
	public int getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	private   String  user_username;
	public int getStart1() {
		return start1;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public void setStart1(int start1) {
		this.start1 = start1;
	}
	public int getPageSum() {
		return pageSum;
	}
	public void setPageSum(int pageSum) {
		this.pageSum = pageSum;
	}
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Page(int start1, int pageSum, String handle, int pageCurrent,
			String user_username) {
		super();
		this.start1 = start1;
		this.pageSum = pageSum;
		this.handle = handle;
		this.pageCurrent = pageCurrent;
		this.user_username = user_username;
	}
	@Override
	public String toString() {
		return "Page [start1=" + start1 + ", pageSum=" + pageSum + ", handle="
				+ handle + ", pageCurrent=" + pageCurrent + ", user_username="
				+ user_username + "]";
	}
}
