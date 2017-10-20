package decorateDemo;

public class PlayerDecorate extends DecoratePhone {

	public PlayerDecorate(IPhone p) {
		super(p);
	}
	
    @Override
    public void call() {
    	super.call();
    	System.out.println("����绰��ʼ����Ϸ");
    }
}
