package templatePattern;

public class ForTime extends TimeTemplate {

	@Override
	public void code(){
		for (int i = 0 ; i < 10000; i++) {
			System.out.println("i");
		}
	}
}
