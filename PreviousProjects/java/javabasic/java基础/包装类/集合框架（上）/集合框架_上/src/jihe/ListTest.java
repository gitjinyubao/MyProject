package jihe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * ������뼯�϶���Ϊobject���ͣ���Ҫ��ȡǿ��ת��
 * @author Administrator
 *
 */
//��ѡ�γ���
public class ListTest {
	public List coursetoSelect;//����ʵ������List�����ڴ�ű�ѡ�γ�
	public ListTest()
	{
		this.coursetoSelect=new ArrayList();//������ʵ����		
	}
    /**
     * ������coursetoSelect����ӱ�ѡ�γ̣���ӣ�
     */
	public void Add()
	{
		//����һ���γ̶��󣬲��ҽ��γ�ͨ��add������ӵ�List��
		Course c1=new Course("1","���ݽṹ");
		coursetoSelect.add(c1);
		Course temp=(Course)coursetoSelect.get(0);//ͨ��get(0)������ȡ�ղŲ���List�е�Ԫ�أ���������ǿ��ת������Ϊͨ��get������ȡ��Ԫ�ض���object���͵ģ����Ա����ȡǿ��ת��
		System.out.println("����˿γ̣�"+temp.id+"     "+temp.name);
		//List�е�Ԫ�ؿ����ظ����
		coursetoSelect.add(c1);//get����������List���е�����λ��
		Course temp2=(Course)coursetoSelect.get(1);//ͨ��get(0)������ȡ�ղŲ���List�е�Ԫ�أ���������ǿ��ת������Ϊͨ��get������ȡ��Ԫ�ض���object���͵ģ����Ա����ȡǿ��ת��
		System.out.println("����˿γ̣�"+temp2.id+"     "+temp2.name);
		//�����в���
		Course c2=new Course("2","c����");
		coursetoSelect.add(0,c2);//��ֵֻ����ǰ��Խ�����ǳ���0Ҳ������Խ�磩���������Խ��
		Course temp1=(Course)coursetoSelect.get(0);
		System.out.println("����˿γ̣�"+temp1.id+"     "+temp1.name);
		/**
		 * Course c2=new Course("2","c����");
		coursetoSelect.add(1,c2);//��ֵֻ����ǰ��Խ�����ǳ���0Ҳ������Խ�磩���������Խ��
		Course temp1=(Course)coursetoSelect.get(1);
		System.out.println("����˿γ̣�"+temp1.id+"     "+temp1.name);
		 */
		/**
		 * Addall�����Ĵ���
		 * 
		 */
		//1.
		Course []c={new Course("3","�������"),new Course("4","��������ԭ��")};
		coursetoSelect.addAll(Arrays.asList(c));//������ת���ɼ���
		Course t1=(Course)coursetoSelect.get(3);
		Course t2=(Course)coursetoSelect.get(4);
		System.out.println("����˿γ̣�"+t1.id+"    "+t1.name);
		System.out.println("����˿γ̣�"+t2.id+"    "+t2.name);
		//2.
		Course [] m={new Course("5","��ѧӢ��"),new Course("6","�ߵ���ѧ")};
		coursetoSelect.addAll(2, Arrays.asList(m));
		Course m1=(Course)coursetoSelect.get(2);
		Course m2=(Course)coursetoSelect.get(3);
		System.out.println("����˿γ̣�"+m1.id+"    "+m1.name);
		System.out.println("����˿γ̣�"+m2.id+"    "+m2.name);	
		System.out.println("______________________");
	}
	/**
	 * ѡ�εı�����ȡ(���)
	 */
	public void testGet()
	{
		System.out.println("�����¿γ̿�ѡ��");
		int size=coursetoSelect.size();
		for(int i=0;i<size;++i)
		{
			Course p=(Course)coursetoSelect.get(i);
			System.out.println("ѡ�˿γ̣�"+p.id+"     "+p.name);
		}
		//����List�����е�˳����ֽ����
	}
	/**
	 * ͨ��������������List
	 * @param args
	 */
	public void testIterator()
	{
		System.out.println("______________________");
		Iterator it=coursetoSelect.iterator();
		System.out.println("�����¿γ̿�ѡ��");
		while(it.hasNext())
		{
			Course cv=(Course)it.next();
			System.out.println("ѡ�˿γ̣�"+cv.id+"     "+cv.name);
		}	
	}
	/**
	 * �������ļ��д����foreach()
	 * @param args
	 */
	public void testForEach()
	{
		System.out.println("______________________");
		System.out.println("�����¿γ̿�ѡ��");
		for(Object h:coursetoSelect)
		{
			Course v=(Course)h;
			System.out.println("ѡ�˿γ̣�"+v.id+"     "+v.name);
		}
	}
	/**
	 * �γ��޸ģ�ͨ��set������
	 * @param args
	 */
	public void xiuGai()
	{
		coursetoSelect.set(4,new Course("7","ë��"));//4��������λ��
	}
	/**
	 * ɾ��List�е�Ԫ��
	 * @param args
	 */
	public void Remove()
	{
		
		//Course f1=(Course)coursetoSelect.get(4);
		//System.out.println("���ǿγ�"+f1.id+"�Ҽ�����ɾ��");
		System.out.println("List��4λ�õ��Ҽ�����ɾ��");
        coursetoSelect.remove(4);
        System.out.println("�ɹ�ɾ��");
        testForEach();
	}
	public void removeAll()
	{
		System.out.println("5��4����ɾ��");
        Course [] s={(Course)coursetoSelect.get(5),(Course)coursetoSelect.get(4)};
		coursetoSelect.removeAll(Arrays.asList(s));//������ת��Ϊ����
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

