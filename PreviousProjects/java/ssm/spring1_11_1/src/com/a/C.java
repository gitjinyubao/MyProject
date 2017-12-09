package com.a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*将类A_XML声明为一个配置类(例如：applicationContext.xml)来对Bean进行配置
  此时类C相当于是Beans    
 而 new A1()则是相当于bean
  */
@Configuration
public class C {
	
	@Bean(name="stroy")
	public   A_interface   a1()
	{
		return   new A1();
	}
}
