package cheng.yuan.nei.bu.lei;

public class Helloworld {
	private static int a=3;
	public static class SInner
	{
		private int a=4;;
		public void show()
		{
		System.out.println(Helloworld.a);
		System.out.println(a);
		}
	}
	public static void main(String[] args)
	{
		SInner s=new SInner();
		s.show();
	}

}