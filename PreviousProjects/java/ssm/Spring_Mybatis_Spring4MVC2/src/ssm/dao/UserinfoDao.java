package ssm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.orm.Userinfo;
import ssm.orm.UserinfoMapper;

@Repository
//@Repository���ڱ�ע���ݷ����������DAO���������xml�ļ���Bean�����������
public class UserinfoDao {
	@Autowired
	private  UserinfoMapper  userinfoMapper;
	public  void insertUserinfo(Userinfo   userinfo)
	{
		System.out.println("userinfoMapper.hashCode="+((Object) userinfoMapper).hashCode());
		userinfoMapper.insertUserinfo(userinfo);
	}
}
