package templateDemo;

public class ForTime  extends GetTimeTemplate{

	@Override
	public void code() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
