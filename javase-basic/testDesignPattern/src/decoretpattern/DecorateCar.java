package decoretpattern;

/*
 * ע��������ǿ���ӵ�й��캯����
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
