package bianli;

import java.io.File;
import java.io.IOException;

public class Lianxi{

	public static void Bianli1(File file) throws IOException {
		// TODO Auto-generated method stub
		
		if(!file.exists())
		{
			System.out.println("文件"+file+"的目录不存在");
		}
		if(!file.isDirectory())
		{
			System.out.println("文件"+file+"不是一个目录");
		}
		
		
		/**
		 * 文件的各种常见API
		 */
		System.out.println(file.getAbsolutePath());//D:\jinyubao\yu\bei\yubao
		System.out.println(file.getName());//yubao
		System.out.println(file.toString());//D:\jinyubao\yu\bei\yubao
		System.out.println(file.getPath());//D:\jinyubao\yu\bei\yubao
		System.out.println(file.getParentFile());//D:\jinyubao\yu\bei
		
		System.out.println("                        ");
		File[] d=file.listFiles();
		if(d!=null&&d.length>0)
		{
		      for(File d1:d)
		      {
		    	  if(d1.exists()&&d1.isDirectory())
		    	  {
		    		  lisDirectory(d1);
		    	  }
		      }
		}
		else
		{
			System.out.println(d);
		}
	}

	private static void lisDirectory(File d1) {
		// TODO Auto-generated method stub
		
	}
	 
	   
}
