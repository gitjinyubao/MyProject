package test;

public class Test {

	public static void main(String[] args) {
		// ������
		GenericPamClass<String> gpc = new GenericPamClass<String>();
		gpc.setObj("ssss");
		System.out.println(gpc.getObj());
		
		// ���ͷ���
		GenericPamMethod gpm = new GenericPamMethod();
		gpm.show("hello");
		gpm.show(true);
		gpm.show(1);
		
		// ���ͽӿ�
		GenericPamInterface<String> gpf = new GenericPamInterfaceImpl<String>();
		gpf.show("word");
	}
}
