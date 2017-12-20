package simpleFactory;

import java.util.Scanner;

public class Shop {
	private int money = 0;
	
	public void sellDrink(String name) {
		if ("greenTea".equals(name)) {
			money = new GreenDrinkFactory().createDrink(5, name).price;
		}
	}
	
	public static void main(String[] args) {
		Shop sp = new Shop();
		while(true){
			Scanner s = new Scanner(System.in);
			System.out.println("请输入购买的茶品名称");
			String str = s.next();
			sp.sellDrink(str);
			System.out.println("总价格" + sp.money);
		}
	}
}
