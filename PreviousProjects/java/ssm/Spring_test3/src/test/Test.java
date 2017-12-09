package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iterfaces.Hello;

public class Test {
	private   int id;
	private   String   username;
    private   Hello   hello;
	
	public void setHello(Hello hello) {
		this.hello = hello;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Test [id=" + id + ", username=" + username + "]";
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//���IOC����
		ApplicationContext   ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
		//��IOC�����л����Ҫ��Bean
		Test t=(Test) ac.getBean("test");
		System.out.println(t.toString());
		System.out.println("----------------------");
		t.hello.SayHello();
	}
}
