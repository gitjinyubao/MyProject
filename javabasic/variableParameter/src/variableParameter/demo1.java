package variableParameter;

/*
 * 可变参数：
 *       定义方法的时候不知道要定义多少个参数
 *       格式：
 *          修饰符 返回值类型 方法名(数据类型...变量名){}
 *          注意：
 *              这里的变量其实就是一个数组
 *              如果一个方法有可变参数，并且有多个参数，那么可变参数一定是在最后一个
 */
public class demo1 {
	public static int addNum(Object...args)
	{
		int sum = 0;
		
		for (int i = 0; i < args.length; ++i)
		{
			sum +=  Integer.parseInt(args[i].toString());
		}
		
		return sum;
	}
	
	public static int add(int...args)
	{
		int sum = 0;
		if (args != null) {
			for (int a : args) {
				sum += a;
			}
		} else {
			sum = 0;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(addNum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(add(null));
	}
}
