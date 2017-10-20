package decorateDemo;

public class MusicDecorate extends DecoratePhone {

	public MusicDecorate(IPhone p) {
		super(p);
	}
	
	@Override
	public void call() {
		System.out.println("ÊÖ»úÌıÒôÀÖ");
        super.call();
	}
}
