package templateDemo;

public abstract class GetTimeTemplate {
	
	public long getTime() {
		long start = System.currentTimeMillis();
		
	    code();
	    
	    long end = System.currentTimeMillis();
	    
	    return end - start;
	}

	public abstract void  code();
}
