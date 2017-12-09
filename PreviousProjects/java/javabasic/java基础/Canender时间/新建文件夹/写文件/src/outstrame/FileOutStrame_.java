package outstrame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutStrame_ {	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		FileOutputStream fos=new FileOutputStream("a.dat");
		fos.write('A');
		fos.write('B');
		fos.write('1');
		int a=9456;
		fos.write(a>>>24);
		fos.write(a>>>16);
		fos.write(a>>>8);
		fos.write(a);
		String s="ÖÐ¹úÈË";
		byte [] b2=s.getBytes("GBK");
		fos.write(b2);
		fos.close();
		lianxi.print("a.dat");
	}
}
