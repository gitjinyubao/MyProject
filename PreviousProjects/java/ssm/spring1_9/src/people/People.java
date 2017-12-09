package people;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class People implements   ApplicationContextAware{

	
	private ApplicationContext  ac;
	//»ñµÃapplicationContext
	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		// TODO Auto-generated method stub
	    this.ac=ac;
	}
	
	
	public   void   resourceText(String words) throws IOException
	{
		Resource   rs=ac.getResource(words);
		System.out.println(rs.getFilename()+"-----"+rs.contentLength());
	}
}
