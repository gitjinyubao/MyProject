package com.a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*����A_XML����Ϊһ��������(���磺applicationContext.xml)����Bean��������
  ��ʱ��C�൱����Beans    
 �� new A1()�����൱��bean
  */
@Configuration
public class C {
	
	@Bean(name="stroy")
	public   A_interface   a1()
	{
		return   new A1();
	}
}
