package singleOneDemo;

import java.io.IOException;

/*
 * 单例模式：使得内存中只有一个对象
 *         饿汉式：
 *              类一加载就创建对象
 *              是不会出问题的单利模式
 *         懒汉式：
 *              用的时候才会去创建对象
 *              可能会出问题的单利模式
 *                 A:懒加载（延迟加载）
 *                 B:线程安全问题
 *                 		a:是否多线程环境
 *                      b:是否共享数据
 *                      c:是否有多条语句共同操作和共享数据     
 *  每个java应用程序都有一个Runtime类实例，使应用程序能够与其运行的环境相链接      
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		HungryMan hm1 = HungryMan.getHungryMan();
		HungryMan hm2 = HungryMan.getHungryMan();
		System.out.println(hm1==hm2);
		System.out.println("==================================");
		LazyMan  lm1 = LazyMan.getLazyMan();
		LazyMan  lm2 = LazyMan.getLazyMan();
		System.out.println(lm1==lm2);
		System.out.println("==================================");
		
		// Runtime也是单利模式
		Runtime rt = Runtime.getRuntime();
		// 启动程序（调用DOS命令）
		  // 打开记事本
		// rt.exec("notepad");
		  // 打开计算器
		// rt.exec("calc");
          // 关闭计算机
		// rt.exec("shutdown -s -t 10000");
		  //取消关闭计算机
		 rt.exec("shutdown -a");
	}
}
