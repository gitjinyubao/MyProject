package people;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class People implements ApplicationContextAware{

	//��������ʼ������ʱ����Զ������������
	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(ac.getBean("people"));
	}
	

}
