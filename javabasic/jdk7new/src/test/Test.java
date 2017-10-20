package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 1. 二进制字面量：
 *              二进制表示整数，使得代码更加容易被理解，语法非常简单，只要在二进制数值前面加Ob或OB
 * 2. 数字字面量下面可以出现下划线：
 *                          增强了对数值额阅读性，对数据分隔
 * 3. 泛型简化
 * 4. 异常的多个catch合并 Day19
 * 5. try-with-resources
 *                      try(必须是java.lang.AutoCloseable的子类对象){...}
 *    好处：
 *        资源自动释放，不需要close()
 *        把需要关闭资源的部分都定义在这里就ok
 *        主要是流体系的对象是这个接口的子类
 */

public class Test {
	
	public static void main(String[] args) {
		// 二进制字面量
		// int x = OB0101011;
		// 数字字面量下面可以出现下划线
		int y = 11_2_3;
		System.out.println(y);
		// 泛型简化
		ArrayList<String> list = new ArrayList<>();
 		// try-with-resources
		try {
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
			
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 改进版本
		try (FileReader fr = new FileReader("a.txt");
				FileWriter fw = new FileWriter("b.txt");) {			
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
