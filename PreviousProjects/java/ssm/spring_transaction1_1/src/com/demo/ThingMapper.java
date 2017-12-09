package com.demo;

public interface ThingMapper {
	/*
	 * @param   out:转出账号
	 * @param   money:转出金额
	 */
	public   void    outMoney(String  out,double  money);
	
	/*
	 * @param   in:转入账号
	 * @param   money:转出金额
	 */
	public   void    inMoney(String  in,double  money);
}

