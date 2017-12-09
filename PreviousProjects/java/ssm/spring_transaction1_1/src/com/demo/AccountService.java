package com.demo;
/*
 * 转账案例业务层接口
 * @autuor  jin
 * @data    2016-3-10
 */
public interface AccountService {
	/*
	 * @param   out  :转出账号
	 * @param   in   :转入账号
	 * @param   money:转出金额
	 */
	public   void    transfer(String  out,String  in,Double  money);

}
