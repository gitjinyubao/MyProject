package com.a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class C {
	
   //�൱���Ǹ�url��ֵ
   @Value("${url}")	
   private    String     url;
   
   @Bean
   @Scope
   public  A    a()
   {
	   return  new  A(url);
   }
}
