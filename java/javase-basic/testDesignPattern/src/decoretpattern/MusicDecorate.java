package decoretpattern;

public class MusicDecorate extends DecorateCar {

	public MusicDecorate(Car car) {
		// 调用父类(抽象类的构造函数)
		super(car);
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("还可以听音乐");
	}
}
