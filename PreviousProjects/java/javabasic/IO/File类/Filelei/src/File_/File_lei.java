package File_;
import java.io.File;
import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class File_lei {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//File file=new File("D:\\宝");
		//File file=new File("D:"+File.separator+"宝");//创建分隔符File.separator
		//判断此文件是否存在于D盘中
//        System.out.println(file.exists());
//        if(!file.exists())//如果不存在这样的文件.......创建一个文件
//        {
//        	file.mkdirs();
//        }
//        else
//        {
//        	file.delete();//否则删除
//        }
       
        File file2=new File("D:\\宝\\鱼","金");
        System.out.println(file2.exists());
        if(!file2.exists())
        {
        	file2.mkdir();
        }
        else
        {
        	file2.delete();
        }
        
        //file简单API
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getParentFile());
        System.out.println(file2.toString());
        System.out.println(file2.getName());
        System.out.println(file2.getPath());       
	}
}
