package decorateDemo;

public abstract class DecoratePhone extends IPhone {
	private IPhone p;
	
	public DecoratePhone(IPhone p) {
		this.p = p ;
	}
	
	@Override
	public void call() {
		this.p.call();
	}
}
