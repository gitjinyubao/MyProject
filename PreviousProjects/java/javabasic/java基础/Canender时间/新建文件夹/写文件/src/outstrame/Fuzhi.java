package outstrame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fuzhi {
	public  static void  Fuzhi_(File name2,File name1) throws IOException
	{
		if(!name1.exists())
		{
			System.out.println("q");
			name1.mkdirs();
		}
		FileOutputStream fos=new FileOutputStream(name2);
		byte [] b1=new byte[2000*1024];
		FileInputStream fis=new FileInputStream(name1);
		int b=0;
		if((b=fis.read(b1, 0, b1.length))!=-1)
		{
			fos.write(b1, 0, b);
		}
		 fis.close();
		 fos.close();
	}
}
