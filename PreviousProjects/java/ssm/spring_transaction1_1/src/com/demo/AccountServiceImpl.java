package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * ת�˰���ҵ���ӿ�ʵ����
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
	 * @param   out  :ת���˺�
	 * @param   in   :ת���˺�
	 * @param   money:ת�����
	 */
	@Override
	public void transfer(String out, String in, Double money) {
		// TODO Auto-generated method stub
		ad.outMoney(out, money);
		ad.inMoney(in, money);
	}
}
