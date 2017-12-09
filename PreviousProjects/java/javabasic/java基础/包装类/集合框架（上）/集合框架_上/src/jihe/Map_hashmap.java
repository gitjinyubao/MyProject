package jihe;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Map_hashmap {
	public Map<String,Student> map;
	public Map_hashmap()
	{
		this.map=new HashMap<String,Student>();
	}
	/**
	 * 添加学生
	 * 
	 */
	public void test_put()
	{
		Scanner input=new Scanner(System.in);
		int i=0;
		for(;i<3;i++)
		{
			System.out.println("请输入学生的ID");
			String ID=input.next();
			//判断ID是否被占用(是否建立映射)
			Student st=map.get(ID);
			if(st==null)
			{
		          System.out.println("请输入学生姓名：");	
		          String name=input.next();
		          //创建新的学生对象
		          Student s1=new Student(ID,name);
		          /**
		           * 添加学生信息(Map的put方法)
		           */
		          map.put(ID, s1);
		          System.out.println("成功添加学生:"+map.get(ID).name);
		          //break;
			}	
			else
			{
				System.out.println("此ID对应的学生已经存在");
				continue;
			}	
		}
	}	
	/**
	 * 返回集合
	 */
	//测试map的KeySet方法（返回的是map的所有键的集合）
 public void testKeySet()
 {
	//通过map的KeySet方法（返回的是map的所有键的集合，map的键在前面已经规定为String类型）
	 Set<String> s=map.keySet();//采用泛型
	 //取得学生容量
	 System.out.println("总共有："+s.size()+"个学生");
	 //通过遍历s，取得每一个键，同时结合get方法得到ID所对应的全部学生对象(value)
	 for(String id1:s)
	 {
		 Student st2=map.get(id1);
		 if(st2!=null)
		 {
			 System.out.println("学生信息："+st2.id+"    "+st2.name);
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map_hashmap m=new Map_hashmap();
		m.test_put();
		m.testKeySet();
	}
}
