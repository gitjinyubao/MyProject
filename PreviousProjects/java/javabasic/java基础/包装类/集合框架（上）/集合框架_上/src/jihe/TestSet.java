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
		Course c1=new Course("1","���ݽṹ");
		l1.add(c1);	
		Course [] c2={new Course("2","��������ԭ��"),new Course("3","c����"),new Course("4","��ɢ��ѧ"),new Course("5","����ԭ��")};
        l1.addAll(Arrays.asList(c2));
	}
	public void ForEach()
	{
		for(Course r6:l1)
		{
			System.out.println("ѡ�˿γ̣�"+r6.id+"      "+r6.name);
		}
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSet t1=new TestSet();
		t1.add();
		t1.ForEach();
		Student s=new Student("1402140097","����");
		Scanner input=new Scanner(System.in);
		
		System.out.println("��ӭ��"+"   "+s.id+"  "+s.name);
		for(int i=0;i<3;++i)
		{
			System.out.println("����������Ҫѡ��Ŀγ̵�ID��");
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
	 * ��ӡ���ѧ�����пγ�
	 */
	public void print(Student s)
	{
		for(Course c9:s.set)
		{
			System.out.println("��ѡ�Ŀγ����£�"+c9.id+"     "+c9.name);
			//��Ϊ�õ���Set�ӿڣ�����ÿ������Ľ��˳��һ������ͬ��Set��������
		}
	}	
	public void date()
	{
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat m=new SimpleDateFormat("yyyy��MM��dd��    hhʱmm��ss��");
		System.out.println(m.format(date));
	}
}

