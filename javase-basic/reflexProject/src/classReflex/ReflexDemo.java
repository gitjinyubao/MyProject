package classReflex;

import java.security.PermissionCollection;

/*
 * ��̬��ȡ������Ϣ����̬���ö���ķ����Ĺ��ܳ�Ϊjava�ķ������
 * ͨ��class�ļ�����ʹ�ø��ļ��ĳ�Ա���������췽���ͳ�Ա����
 * 
 * ʹ�ã�
 *     Ҫ������ʹ�ã����������õ�class�ļ�������ʵ����Class��Ķ���
 *     Class�ࣺ
 *            ��Ա����  Field
 *            ���췽��  Constractor
 *            ��Ա����  Method
 *            
 * �õ�class�ļ�����ķ�ʽ��
 *    1. Object.getClass()����
 *    2. �����͵ľ�̬����class
 *    3. Class���еľ�̬����forName()
 *    
 * ����ʹ��˭��
 * 1. �Լ��棺��ѡ
 * 2. ������ ������
 *    Ϊʲô����Ϊ��������һ���ַ�����������һ��������������������ǾͿ��԰��������ַ����������ļ���
 */
public class ReflexDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
	    // ��ʽһ
		Person p1 = new Person();
		Class c1 = p1.getClass();
		
		Person p2 = new Person();
		Class c2 = p1.getClass();
		
		System.out.println(p2==p1);
		System.out.println(c1==c2);
		
		System.out.println("=====================================");
		
		// ��ʽ��
		Class c3 = Person.class;
		System.out.println(c1==c3);
		
		System.out.println("====================================");
		
		// ��ʽ��
		Class c4 = Class.forName("classReflex.Person");
		System.out.println(c1==c4);
	}
}
