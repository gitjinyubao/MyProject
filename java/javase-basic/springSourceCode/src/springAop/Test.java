package springAop;

public class Test {
	
	public static void main(String[] args) {
		//ʵ����һ��DynamicProxy�������
	    //ͨ��getProxyObject������ñ������Ķ���
	    Math math=(Math)new DynamicProxy().getProxyObject(new Math());
	    
        int n1=100,n2=5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
	   /* //��һ��������Ķ���,������Ҫ���±༭�������
	    Message message=(Message) new DynamicProxy().getProxyObject(new Message());
	    
	    public void test02()
	    {
	        message.message();
	    }*/
	}
}
