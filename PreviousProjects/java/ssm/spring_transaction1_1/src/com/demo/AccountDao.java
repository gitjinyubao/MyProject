package com.demo;
/*
 * 转账Dao层接口(数据访问层接口)
 * @autuor  jin
 * @data    2016-3-10
 */
public interface AccountDao {
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
