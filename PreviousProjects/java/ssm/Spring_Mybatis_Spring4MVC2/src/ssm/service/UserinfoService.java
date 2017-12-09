package ssm.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.AllDao;
import ssm.orm.Userinfo;

@Service
public class UserinfoService {
	@Autowired
	private  AllDao   allDao;
	
	
	public  void insertUserinfo(String password, int age, Date insertdate)
	{
		System.out.println("allDao.hashCode="+((Object) allDao).hashCode());
		Userinfo   userinfo=new Userinfo(-1,password,age,insertdate);
		allDao.getUserinfoDao().insertUserinfo(userinfo);
	}
}
