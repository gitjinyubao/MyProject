package people;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class People implements ApplicationContextAware{

	//当容器初始化化的时候会自动调用这个方法
	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(ac.getBean("people"));
	}
	

}
