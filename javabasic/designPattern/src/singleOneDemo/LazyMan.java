package singleOneDemo;

public class LazyMan {
	private static LazyMan lm = null;
	
	private LazyMan() {
	}
	
	public static LazyMan getLazyMan() {
		if (lm == null) {
			lm = new LazyMan();
		}
		
		return lm;
	}
}
