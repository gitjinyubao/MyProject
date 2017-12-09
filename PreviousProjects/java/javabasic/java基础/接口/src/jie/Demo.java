package jie;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IJie i=new MobilePhone();
		i.play();
		Tp t=new MobilePhone();
		t.tox();
		IJie i1=new Psp();
		i1.play();
		
		
		
		
		
		//匿名内部类
		IJie i2=new IJie(){
			 public void play()
			 {
				 System.out.println("可以玩游戏le");
			 }
		};
		i2.play();
	}
	


}

