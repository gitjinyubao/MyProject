package cheng.yuan.nei.bu.lei;

public class Hello {
	private int a=2;
	class Inner
	{
		private int a=4;
		public void show()
		{
			System.out.println(Hello.this.a);
			System.out.println(a);
		}
	}
public static void main(String[] args)
{
	Hello h=new Hello();
	Inner n=h.new Inner();
	n.show();
}
}
