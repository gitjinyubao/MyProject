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
	 * ���ѧ��
	 * 
	 */
	public void test_put()
	{
		Scanner input=new Scanner(System.in);
		int i=0;
		for(;i<3;i++)
		{
			System.out.println("������ѧ����ID");
			String ID=input.next();
			//�ж�ID�Ƿ�ռ��(�Ƿ���ӳ��)
			Student st=map.get(ID);
			if(st==null)
			{
		          System.out.println("������ѧ��������");	
		          String name=input.next();
		          //�����µ�ѧ������
		          Student s1=new Student(ID,name);
		          /**
		           * ���ѧ����Ϣ(Map��put����)
		           */
		          map.put(ID, s1);
		          System.out.println("�ɹ����ѧ��:"+map.get(ID).name);
		          //break;
			}	
			else
			{
				System.out.println("��ID��Ӧ��ѧ���Ѿ�����");
				continue;
			}	
		}
	}	
	/**
	 * ���ؼ���
	 */
	//����map��KeySet���������ص���map�����м��ļ��ϣ�
 public void testKeySet()
 {
	//ͨ��map��KeySet���������ص���map�����м��ļ��ϣ�map�ļ���ǰ���Ѿ��涨ΪString���ͣ�
	 Set<String> s=map.keySet();//���÷���
	 //ȡ��ѧ������
	 System.out.println("�ܹ��У�"+s.size()+"��ѧ��");
	 //ͨ������s��ȡ��ÿһ������ͬʱ���get�����õ�ID����Ӧ��ȫ��ѧ������(value)
	 for(String id1:s)
	 {
		 Student st2=map.get(id1);
		 if(st2!=null)
		 {
			 System.out.println("ѧ����Ϣ��"+st2.id+"    "+st2.name);
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
