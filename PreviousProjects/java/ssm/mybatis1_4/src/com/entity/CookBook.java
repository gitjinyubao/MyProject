package com.entity;

import org.springframework.stereotype.Component;

@Component
public class CookBook {
	private  int  g_id;
	private  int  m_id;
	private  int  sum;
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "CookBook [g_id=" + g_id + ", m_id=" + m_id + ", sum=" + sum
				+ "]";
	}
	public CookBook(int g_id, int m_id, int sum) {
		super();
		this.g_id = g_id;
		this.m_id = m_id;
		this.sum = sum;
	}
	public CookBook() {
		super();
		// TODO Auto-generated constructor stub
	}
}
