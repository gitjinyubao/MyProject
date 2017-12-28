package test;

public class Test {

	public static void main(String[] args) {
		// 泛型类
		GenericPamClass<String> gpc = new GenericPamClass<String>();
		gpc.setObj("ssss");
		System.out.println(gpc.getObj());
		
		// 泛型方法
		GenericPamMethod gpm = new GenericPamMethod();
		gpm.show("hello");
		gpm.show(true);
		gpm.show(1);
		
		// 泛型接口
		GenericPamInterface<String> gpf = new GenericPamInterfaceImpl<String>();
		gpf.show("word");
	}
}
