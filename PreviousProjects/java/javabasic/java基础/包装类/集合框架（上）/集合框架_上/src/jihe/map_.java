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
			 * ����ѧ��ID;
			 */
			System.out.println("������ѧ����ID:");
			String ID= input.next();
			/**
			 * �жϴ�ID���ɵ�ӳ���Ƿ����,get�������Ƿ�Ӧ�Ƿ���ڴ�ID����µ�ӳ�䣬�������ֵ�ǿ�ֵ�������޴�ӳ�䣬�������
			 */
			Student st=map.get(ID);
			if(st==null)
			{
			        System.out.println("������ѧ��������");
			        String name=input.next();
		            Student s1=new Student(ID,name);
		            map.put(ID, s1);
		            /**
		             * ����ӳ�䣬��ȡ�����Ԫ��
		             */
		            System.out.println("���ѧ����"+map.get(ID).name);
		            System.out.println("�Ƿ�������룿���밴1���������1������ֵ");
		            int c=0;
		            c=input.nextInt();
		            if(c!=1)
		            	break;       
			}
			else
			{
				System.out.println("�������ID�Ѿ���ռ�ã�����������������������");
				System.out.println("�Ƿ�������룿���밴1���������1������ֵ");
				int c=0;
	            c=input.nextInt();
	            if(c!=1)
	            	break;
			}
		}
	}
	public void tes_tremove()
	{
		while(true)//����һ����ѭ��
		{
			Scanner input=new Scanner(System.in);
			System.out.println("��������Ҫɾ����ѧ��ID:");
			String ID=input.next();
			Student s=map.get(ID);
			if(s==null)
			{
				System.out.println("��ID�����ڣ�����������");
				continue;
			}
			else
			{
				map.remove(ID);
				System.out.println("�Ѿ��ɹ�ɾ����"+s.name);
				break;
			}
		}
	}
	public void testEntrySet()
	{
		//ͨ��entrySet()������map�е����м�ֵ��
		Set<Entry<String,Student>> entrySet=map.entrySet();
		for (Entry<String, Student> s : entrySet) {
			System.out.println("ȡ�õļ�Ϊ��"+s.getKey());
			System.out.println("��Ӧ��ֵΪ��"+s.getValue().name);
		}
	}
	public void testkeySet()
	{
		/**
		 * ���ص���map���м��ļ���
		 */
		Set<String> s=map.keySet();
		System.out.println("���ѧ������Ϊ��"+s.size());
		/**
		 * �õ�������ӵ�ѧ����Ϣ
		 */
		for(String id:s)
		{
		     Student s4=map.get(id);
		     System.out.println("���ѧ����"+map.get(id).id+"    "+s4.name);
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
