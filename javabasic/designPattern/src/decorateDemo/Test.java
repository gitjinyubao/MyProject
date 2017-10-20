package decorateDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 装饰模式：
 *        使用被装饰类的一个子类的实例，在客户端将这个实例交给装饰类，是继承的替代方案
 *        使用装饰模式可以替代继承俩扩展功能的方式。更加灵活。动态添加功能，可以随意组合
 *        随意组合，可能造成逻辑混乱
 */
public class Test {

	public static void main(String[] args) {
		IPhone p = new Phone();
		
		DecoratePhone mudOne = new MusicDecorate(p);
		
		mudOne.call();
			
		DecoratePhone mudTwo = new PlayerDecorate(p);
		
		mudTwo.call();
		
		// 装饰模式组合在一起使用
		DecoratePhone mudThree = new PlayerDecorate(new MusicDecorate(p));
		
		mudThree.call();
		
		// 装饰模式应用在IO流中是最多的
		// 字节流装饰成一个字符流，字符流装饰成高效的字符流
		// System.in 返回值是inputStream
		/* InputStream is = System.in;
		 * InputStreamReader isr = new InputStreamReader(is);
		 * BufferedReader br = new BufferedReader(isr);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 读操作
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 写操作
		Scanner ac = new Scanner(System.in);
	}
}
