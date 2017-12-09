package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * 转账案例业务层接口实现类
 * @autuor  jin
 * @data    2016-3-10
 */
@Service
public class AccountServiceImpl implements AccountService {
private   AccountDao   ad;

    @Autowired
	public void setAd(AccountDao ad) {
	this.ad = ad;
}

	/*
	 * @param   out  :转出账号
	 * @param   in   :转入账号
	 * @param   money:转出金额
	 */
	@Override
	public void transfer(String out, String in, Double money) {
		// TODO Auto-generated method stub
		ad.outMoney(out, money);
		ad.inMoney(in, money);
	}
}
