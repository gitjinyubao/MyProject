package ssm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AllDao {
	@Autowired
	private   UserinfoDao  userinfoDao;
	
	public   UserinfoDao   getUserinfoDao()
	{
		System.out.println("userinfoDao.hashCode="+((Object) userinfoDao).hashCode());
		return   userinfoDao;
	}
	

}
