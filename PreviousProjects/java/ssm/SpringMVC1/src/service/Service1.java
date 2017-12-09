package service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class Service1 {
	public List   getUserms()
	{
		List   listusername=new   ArrayList();
		for(int i=0;i<=10;++i)
		{
			listusername.add("username"+(i+1));
		}
		return  listusername;
	}
}
