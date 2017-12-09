package jihe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * 对象存入集合都变为object类型，需要采取强制转化
 * @author Administrator
 *
 */
//备选课程类
public class ListTest {
	public List coursetoSelect;//属性实例化，List：用于存放备选课程
	public ListTest()
	{
		this.coursetoSelect=new ArrayList();//对属性实例化		
	}
    /**
     * 用于往coursetoSelect中添加备选课程（添加）
     */
	public void Add()
	{
		//创建一个课程对象，并且将课程通过add方法添加到List中
		Course c1=new Course("1","数据结构");
		coursetoSelect.add(c1);
		Course temp=(Course)coursetoSelect.get(0);//通过get(0)方法获取刚才插入List中的元素，并且运用强制转化，因为通过get方法获取的元素都是object类型的，所以必须采取强制转化
		System.out.println("添加了课程："+temp.id+"     "+temp.name);
		//List中的元素可以重复添加
		coursetoSelect.add(c1);//get出的是它在List表中的索引位置
		Course temp2=(Course)coursetoSelect.get(1);//通过get(0)方法获取刚才插入List中的元素，并且运用强制转化，因为通过get方法获取的元素都是object类型的，所以必须采取强制转化
		System.out.println("添加了课程："+temp2.id+"     "+temp2.name);
		//队列中插入
		Course c2=new Course("2","c语言");
		coursetoSelect.add(0,c2);//数值只能向前超越（但是超过0也是属于越界），不能向后越界
		Course temp1=(Course)coursetoSelect.get(0);
		System.out.println("添加了课程："+temp1.id+"     "+temp1.name);
		/**
		 * Course c2=new Course("2","c语言");
		coursetoSelect.add(1,c2);//数值只能向前超越（但是超过0也是属于越界），不能向后越界
		Course temp1=(Course)coursetoSelect.get(1);
		System.out.println("添加了课程："+temp1.id+"     "+temp1.name);
		 */
		/**
		 * Addall方法的创建
		 * 
		 */
		//1.
		Course []c={new Course("3","汇编语言"),new Course("4","计算机组成原理")};
		coursetoSelect.addAll(Arrays.asList(c));//将数组转化成集合
		Course t1=(Course)coursetoSelect.get(3);
		Course t2=(Course)coursetoSelect.get(4);
		System.out.println("添加了课程："+t1.id+"    "+t1.name);
		System.out.println("添加了课程："+t2.id+"    "+t2.name);
		//2.
		Course [] m={new Course("5","大学英语"),new Course("6","高等数学")};
		coursetoSelect.addAll(2, Arrays.asList(m));
		Course m1=(Course)coursetoSelect.get(2);
		Course m2=(Course)coursetoSelect.get(3);
		System.out.println("添加了课程："+m1.id+"    "+m1.name);
		System.out.println("添加了课程："+m2.id+"    "+m2.name);	
		System.out.println("______________________");
	}
	/**
	 * 选课的遍历获取(输出)
	 */
	public void testGet()
	{
		System.out.println("有如下课程可选：");
		int size=coursetoSelect.size();
		for(int i=0;i<size;++i)
		{
			Course p=(Course)coursetoSelect.get(i);
			System.out.println("选了课程："+p.id+"     "+p.name);
		}
		//是以List序列中的顺序呈现结果的
	}
	/**
	 * 通过迭代器来遍历List
	 * @param args
	 */
	public void testIterator()
	{
		System.out.println("______________________");
		Iterator it=coursetoSelect.iterator();
		System.out.println("有如下课程可选：");
		while(it.hasNext())
		{
			Course cv=(Course)it.next();
			System.out.println("选了课程："+cv.id+"     "+cv.name);
		}	
	}
	/**
	 * 迭代器的简便写法：foreach()
	 * @param args
	 */
	public void testForEach()
	{
		System.out.println("______________________");
		System.out.println("有如下课程可选：");
		for(Object h:coursetoSelect)
		{
			Course v=(Course)h;
			System.out.println("选了课程："+v.id+"     "+v.name);
		}
	}
	/**
	 * 课程修改（通过set方法）
	 * @param args
	 */
	public void xiuGai()
	{
		coursetoSelect.set(4,new Course("7","毛概"));//4代表索引位置
	}
	/**
	 * 删除List中的元素
	 * @param args
	 */
	public void Remove()
	{
		
		//Course f1=(Course)coursetoSelect.get(4);
		//System.out.println("我是课程"+f1.id+"我即将被删除");
		System.out.println("List中4位置的我即将被删除");
        coursetoSelect.remove(4);
        System.out.println("成功删除");
        testForEach();
	}
	public void removeAll()
	{
		System.out.println("5和4即将删除");
        Course [] s={(Course)coursetoSelect.get(5),(Course)coursetoSelect.get(4)};
		coursetoSelect.removeAll(Arrays.asList(s));//将数组转化为集合
		testForEach();
	}
	public static void main(String [] args)
	{
		ListTest t1=new ListTest();
		t1.Add();
		t1.testGet();
		t1.testIterator();
		t1.testForEach();
		t1.xiuGai();
		t1.testForEach();
		t1.Remove();
		t1.removeAll();
	}
	
}

