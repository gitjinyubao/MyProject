package ssm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.orm.Userinfo;
import ssm.orm.UserinfoMapper;

@Repository
//@Repository用于标注数据访问组件，即DAO组件；减少xml文件中Bean丁定义的数量
public class UserinfoDao {
	@Autowired
	private  UserinfoMapper  userinfoMapper;
	public  void insertUserinfo(Userinfo   userinfo)
	{
		System.out.println("userinfoMapper.hashCode="+((Object) userinfoMapper).hashCode());
		userinfoMapper.insertUserinfo(userinfo);
	}
}
