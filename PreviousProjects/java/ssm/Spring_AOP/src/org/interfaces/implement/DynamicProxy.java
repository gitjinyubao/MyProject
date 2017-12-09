package org.interfaces.implement;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
private   Object    obj;  
public    Object    bind(Object   obj)
{
	this.obj=obj;
	return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(), this);
}
	@Override
	public Object invoke(Object proxy, Method method, Object[] objs)
			throws Throwable {
		// TODO Auto-generated method stub
		Object   result =null;
		validateUser();
		result=method.invoke(obj, objs);
		return result;
	}
	public void  validateUser()
	{
		System.out.println("验证用户....");
	}
}