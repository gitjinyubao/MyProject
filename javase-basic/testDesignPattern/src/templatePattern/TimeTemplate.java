package templatePattern;

public abstract class TimeTemplate {
	
	public long start = 0l;
	public long end = 0l;

	public long getTime() {
		this.start = System.currentTimeMillis();
		
		code();
		
		this.end = System.currentTimeMillis();
		
		return (end - start);
	}

	public abstract void code();
}
