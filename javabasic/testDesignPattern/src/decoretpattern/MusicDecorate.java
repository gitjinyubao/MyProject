package decoretpattern;

public class MusicDecorate extends DecorateCar {

	public MusicDecorate(Car car) {
		// ���ø���(������Ĺ��캯��)
		super(car);
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("������������");
	}
}
