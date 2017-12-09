package org.interfaces.implement;

import org.interfaces.IHello;

public class ProxyHello implements IHello {
private   IHello    hello;

	
	@Override
	public void sayHello1() {
		// TODO Auto-generated method stub
		this.validateUser();
		hello.sayHello1();

	}

	public ProxyHello(IHello hello) {
		super();
		this.hello = hello;
	}

	@Override
	public void sayHello2() {
		// TODO Auto-generated method stub
		this.validateUser();
		hello.sayHello2();

	}

	@Override
	public void sayHello3() {
		// TODO Auto-generated method stub
		this.validateUser();
        hello.sayHello3();
	}
	
	public void   validateUser()
	{
		System.out.println("验证用户登录");
	}

}
