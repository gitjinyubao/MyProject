package math;

public class M {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[10];
		for(int i=0;i<10;++i)
		{
			a[i]=(int)(Math.random()*10);
		}
		for(int e :a)
		{
			System.out.println(e);
		}//使用foreach语句进行遍历循环
		System.out.println(a.toString());
	}
}
