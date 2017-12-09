package aService;

import aDao.ADao;

public class AServiceImpl implements AService {
private  ADao  aDao;

/*构造器注入;此处参数名称与引用名称必须一致;
  xml文档中用构造注入设定的name值与引用名称是一致的*/
public   AServiceImpl(ADao  aDao)
{
	this.aDao=aDao;
}
	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		aDao.save(arg);
		System.out.println("AServiceImpl"+arg+this.hashCode());

	}

}
