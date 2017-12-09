package 检查线程的存活与中断;
public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   B a=new B("金玉宝");
	       Thread t=new Thread(a);//建立线程对象
	       B a1=new B("张宽");
	       Thread t1=new Thread(a1);//建立线程对象
	       t.start();
	       t1.start();
	       t.setName("金玉宝");
	       t1.setName("张宽");
	       Thread.sleep(700);
	       System.out.println("线程总数："+Thread.activeCount());
	       //判断线程的存活与中断
//	       if(t.isAlive())//判断是否存活
//	       {
//	    	   System.out.println("中断金玉宝购买彩票");
//	    	   t.interrupt();//中断金玉宝购买彩票
//	       }
//	       if(t1.isAlive())//判断是否存活
//	       {
//	    	   System.out.println("中断张宽购买彩票");
//	    	   t1.interrupt();//中断张宽购买彩票
//	       }
	}
}
