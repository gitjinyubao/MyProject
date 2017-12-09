package org.beanpost;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



public class Test {
	public static void main(String[] args) {
	{
            ClassPathResource    res=new    ClassPathResource("config.xml");
            XmlBeanFactory   factory=new XmlBeanFactory(res);
            BeanFactoryPostProcessor   prr=(BeanFactoryPostProcessor)factory.getBean("beanfactorypost");
            prr.postProcessBeanFactory(factory);
            HelloWorld     hd=(HelloWorld)factory.getBean("helloeorld");
            System.out.println(hd.getMessage());
            
	}
	}
}
