package simpleFactory;

public abstract class Drink{
	
	// 定义变量
	public String name;
	public int price;
	
	// 获得名称价格
	public abstract String getName();
	
	public abstract int getPrice();
}