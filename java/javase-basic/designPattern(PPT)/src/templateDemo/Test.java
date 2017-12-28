package templateDemo;

/* 编程原则：关修改，开扩展
 * 模板设计模式：
 *           定义：
 *               定义一个算法的骨架（抽象类中），而将具体的算法延迟到子类中
 *           优点：
 *               在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求
 *           缺点：
 *               如果算法骨架有修改的话，则需要修改抽象类
 */
public class Test {
	
	public static void main(String[] args) {
		GetTimeTemplate gtOne = new ForTime();
		System.out.println("时间：" + gtOne.getTime());
		System.out.println("===================================");
		GetTimeTemplate gtTwo = new WhileTime();
		System.out.println("时间：" + gtTwo.getTime());
	}
}
