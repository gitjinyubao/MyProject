package jihe;
import java.util.ArrayList;
import java.util.List;
public class TestGneric {
	/**
	 * ���÷���
	 */
	public List<Course> course;
	public TestGneric()
	{
		this.course=new ArrayList<Course>();
	}
	public void add()
	{
		Course p=new Course("1","��ѧ����");
		course.add(p);
		//���ͼ����в�����ӷ��͹涨�����ͼ�������������Ķ���
		//course.add("�������һЩ��ֵĶ���������ô��");
	}
	public void ForEach()
	{
		for(Course l:course)
		{
			System.out.println("ѡ�˿γ̣�"+l.id+"     "+l.name);
		}
	}
	//���ͽ�Ͽ�����ӷ��������͵Ķ���ʵ��
	public void testChild()
	{
		ChildCourse b2=new ChildCourse();
		b2.id="2";
		b2.name="���������͵Ŀγ̶���ʵ��";
		course.add(b2);	
	}
	//���Ͳ���ʹ�û������ͣ�������������
	public void testLei()
	{
		//List <int> list=new ArrayList<int>();  intΪ�������ͣ�����ʹ�÷��͹涨
		List <Integer> list=new ArrayList<Integer>();//��װ����Ϊ����
		list.add(1);
		System.out.println(list.get(0));
	}
	public static void 
	main(String [] args)
	{
		TestGneric t1=new TestGneric();
		t1.add();
		t1.ForEach();
		t1.testChild();
		t1.ForEach();
		t1.testLei();
	}
}
