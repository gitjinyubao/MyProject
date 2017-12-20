package templatePattern;

public class WhileTime extends TimeTemplate{

	@Override
	public void code() {
		int i = 0;
		while(i < 1000) {
			System.out.println(i);
			i++;
		}
	}
}
