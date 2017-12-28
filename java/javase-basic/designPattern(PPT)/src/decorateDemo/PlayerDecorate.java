package decorateDemo;

public class PlayerDecorate extends DecoratePhone {

	public PlayerDecorate(IPhone p) {
		super(p);
	}
	
    @Override
    public void call() {
    	super.call();
    	System.out.println("打完电话开始玩游戏");
    }
}
