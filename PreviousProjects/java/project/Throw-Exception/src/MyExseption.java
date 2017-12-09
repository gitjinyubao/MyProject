@SuppressWarnings("serial")
public class MyExseption extends RuntimeException{

	public MyExseption() {
		//对于无参数构造函数，可以不显示的调用父类的无参构造函数
		super();
		// TODO Auto-generated constructor stub
		System.out.println("error!!!");
	}
}
