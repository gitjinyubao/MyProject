package aService;

import aDao.ADao;

public class AServiceImpl implements AService {
private  ADao  aDao;

/*������ע��;�˴������������������Ʊ���һ��;
  xml�ĵ����ù���ע���趨��nameֵ������������һ�µ�*/
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
