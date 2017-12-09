package jihe;
import java.util.ArrayList;
import java.util.List;
public class TestGneric {
	/**
	 * 运用泛型
	 */
	public List<Course> course;
	public TestGneric()
	{
		this.course=new ArrayList<Course>();
	}
	public void add()
	{
		Course p=new Course("1","大学物理");
		course.add(p);
		//泛型集合中不能添加泛型规定的类型及其子类型以外的对象
		//course.add("里面添加一些奇怪的东西，可以么？");
	}
	public void ForEach()
	{
		for(Course l:course)
		{
			System.out.println("选了课程："+l.id+"     "+l.name);
		}
	}
	//泛型结合可以添加泛型子类型的对象实例
	public void testChild()
	{
		ChildCourse b2=new ChildCourse();
		b2.id="2";
		b2.name="我是子类型的课程对象实例";
		course.add(b2);	
	}
	//泛型不能使用基本类型，需用引用类型
	public void testLei()
	{
		//List <int> list=new ArrayList<int>();  int为基本类型，不可使用泛型规定
		List <Integer> list=new ArrayList<Integer>();//包装类作为泛型
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
