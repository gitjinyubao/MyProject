package springAop;

public class Test {
	
	public static void main(String[] args) {
		//实例化一个DynamicProxy代理对象
	    //通过getProxyObject方法获得被代理后的对象
	    Math math=(Math)new DynamicProxy().getProxyObject(new Math());
	    
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
	   /* //另一个被代理的对象,不再需要重新编辑代理代码
	    Message message=(Message) new DynamicProxy().getProxyObject(new Message());
	    
	    public void test02()
	    {
	        message.message();
	    }*/
	}
}
