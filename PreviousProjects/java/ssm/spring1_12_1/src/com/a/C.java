package com.a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class C {
	
   //相当于是给url赋值
   @Value("${url}")	
   private    String     url;
   
   @Bean
   @Scope
   public  A    a()
   {
	   return  new  A(url);
   }
}
