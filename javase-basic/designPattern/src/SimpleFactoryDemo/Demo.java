package SimpleFactoryDemo;

/*
 * 优点：客户端不需要再负责对象的创建，从而明确了各个类的职责，如果有新的类增加，
 *     只需要增加一个具体的类和具体的工厂类即可。不影响已有的代码，后期维护容易，增强了系统的扩展性。
 * 缺点：需要额外的编写代码，增加了编写的代码量。
 */
public class Demo {
	
	public static void main(String[] args) {
		// 造出一只狗
		DogFactory df = new DogFactory();
		df.createAnimal().eat();;
		
		CatFactory cf = new CatFactory();
		cf.createAnimal().eat();
	}
}
