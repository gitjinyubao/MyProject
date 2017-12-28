package decorateDemo;

public class Phone extends IPhone {

	@Override
	public void call() {
		System.out.println("手机打电话");
	}
}
