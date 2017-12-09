package jihe;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestSet {
	public List <Course> l1;
	public TestSet()
	{
		this.l1=new ArrayList<Course>();
	}
	public void add()
	{
		Course c1=new Course("1","数据结构");
		l1.add(c1);	
		Course [] c2={new Course("2","计算机组成原理"),new Course("3","c语言"),new Course("4","离散数学"),new Course("5","编译原理")};
        l1.addAll(Arrays.asList(c2));
	}
	public void ForEach()
	{
		for(Course r6:l1)
		{
			System.out.println("选了课程："+r6.id+"      "+r6.name);
		}
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSet t1=new TestSet();
		t1.add();
		t1.ForEach();
		Student s=new Student("1402140097","金玉宝");
		Scanner input=new Scanner(System.in);
		
		System.out.println("欢迎："+"   "+s.id+"  "+s.name);
		for(int i=0;i<3;++i)
		{
			System.out.println("请输入您需要选择的课程的ID：");
			String  id=input.next();
			for(Course c8:t1.l1)
			{
				if(c8.id.equals(id))
				{
				     s.set.add(c8); 	
				}
			}
		}
		t1.print(s);
		t1.date();
		
	}
	/*
	 * 打印输出学生所有课程
	 */
	public void print(Student s)
	{
		for(Course c9:s.set)
		{
			System.out.println("您选的课程如下："+c9.id+"     "+c9.name);
			//因为用的是Set接口，所以每次输出的结果顺序不一定都相同，Set的无序性
		}
	}	
	public void date()
	{
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat m=new SimpleDateFormat("yyyy年MM月dd日    hh时mm分ss秒");
		System.out.println(m.format(date));
	}
}

