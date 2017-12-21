package factoryMethodDemo;

/*
 * 缺点：每次增加新的类，都要在工厂类中改变，增加一个if判断
 */
public class Demo {
	public static void main(String[] args) {
		AnimalFactory.createAnimal("dog").eat();;
	}
}
