package decoretpattern;

public class Test {
	public static void main(String[] args) {
		Car c = new BenzCar();
		DecorateCar dc = new MusicDecorate(c);
		dc.run();
		System.out.println("========");
		new DecorateCar(c) {
			@Override
			public void run() {
				super.run();
				System.out.println("还可以赛车");
			}
		}.run();
	}
}
