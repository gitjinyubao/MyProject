package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class map_ {
	public Map<String,Student> map;
	public map_()
	{
		this.map=new HashMap<String,Student>();
	}
	public void testPut()
	{
		Scanner input=new Scanner(System.in);
		int i=0;
		for(;;i++)
		{
			/**
			 * 输入学生ID;
			 */
			System.out.println("请输入学生的ID:");
			String ID= input.next();
			/**
			 * 判断此ID构成的映射是否存在,get方法就是反应是否存在此ID情况下的映射，如果返回值是空值，则是无此映射，可以添加
			 */
			Student st=map.get(ID);
			if(st==null)
			{
			        System.out.println("请输入学生姓名：");
			        String name=input.next();
		            Student s1=new Student(ID,name);
		            map.put(ID, s1);
		            /**
		             * 运用映射，调取对象的元素
		             */
		            System.out.println("添加学生："+map.get(ID).name);
		            System.out.println("是否继续输入？是请按1，不是请除1按任意值");
		            int c=0;
		            c=input.nextInt();
		            if(c!=1)
		            	break;       
			}
			else
			{
				System.out.println("您输入的ID已经被占用！！！！！！，请重新输入");
				System.out.println("是否继续输入？是请按1，不是请除1按任意值");
				int c=0;
	            c=input.nextInt();
	            if(c!=1)
	            	break;
			}
		}
	}
	public void tes_tremove()
	{
		while(true)//定义一个死循环
		{
			Scanner input=new Scanner(System.in);
			System.out.println("请输入需要删除的学生ID:");
			String ID=input.next();
			Student s=map.get(ID);
			if(s==null)
			{
				System.out.println("该ID不存在，请重新输入");
				continue;
			}
			else
			{
				map.remove(ID);
				System.out.println("已经成功删除："+s.name);
				break;
			}
		}
	}
	public void testEntrySet()
	{
		//通过entrySet()，返回map中的所有键值对
		Set<Entry<String,Student>> entrySet=map.entrySet();
		for (Entry<String, Student> s : entrySet) {
			System.out.println("取得的键为："+s.getKey());
			System.out.println("对应的值为："+s.getValue().name);
		}
	}
	public void testkeySet()
	{
		/**
		 * 返回的是map所有键的集合
		 */
		Set<String> s=map.keySet();
		System.out.println("添加学生人数为："+s.size());
		/**
		 * 得到所有添加的学生信息
		 */
		for(String id:s)
		{
		     Student s4=map.get(id);
		     System.out.println("添加学生："+map.get(id).id+"    "+s4.name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map_ c=new map_();
		c.testPut();
		c.testkeySet();
		c.tes_tremove();
		c.testEntrySet();
	}
}
