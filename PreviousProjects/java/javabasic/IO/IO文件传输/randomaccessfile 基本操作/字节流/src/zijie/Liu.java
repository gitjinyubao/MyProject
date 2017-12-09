package zijie;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Liu{ 
	public static void prHexint(String filename)throws IOException {
        FileInputStream fis=new FileInputStream(filename);  
        int b;
        int i=1;
        while((b=fis.read())!=-1)
        {
        	if(b<=0xf)
        	{
        		    // System.out.println("0");
                     System.out.print("0");   
                     //print后面友ln则是换行输出     		
        	}
        	    System.out.print(Integer.toHexString(b)+"  ");
        	if(i++%10==0)
        	{
        		System.out.println();
        	}
        }
        fis.close();
	}
}
