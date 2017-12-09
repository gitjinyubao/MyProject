package com.demo;

import org.springframework.stereotype.Repository;


@Repository
public class AccountDaoImpl implements  AccountDao{

	private   ThingMapper  tm;
	@Override
	public void outMoney(String out, double money) {
		// TODO Auto-generated method stub
		tm.outMoney(out, money);
		
	}
	@Override
	public void inMoney(String in, double money) {
		// TODO Auto-generated method stub
		tm.inMoney(in, money);
	}
}
