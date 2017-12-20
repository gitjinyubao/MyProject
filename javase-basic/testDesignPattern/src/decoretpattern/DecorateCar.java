package decoretpattern;

/*
 * 注意抽象类是可以拥有构造函数的
 */
public abstract class DecorateCar extends Car {
	private Car car;
	
	public DecorateCar(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		this.car.run();
	}
	
}
