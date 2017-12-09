package cheng.yuan.nei.bu.lei;

public class Jin {
	private int a=9;
	public void show()
	{
		 int b=10;
		 class Yu
		 {
			private int m;
			public void print()
			{
				m=Jin.this.a+b;
				System.out.println(m);
			}
		 }
		 Yu y=new Yu();
			y.print();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jin j=new Jin();
		j.show();

	}

}
