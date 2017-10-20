package configTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * �Ҹ���ArrayList<Integer> ��һ������������������������һ���ַ������ݣ����ʵ�֣�
 *    ���÷����ƹ�����׶Σ��ƹ�����
 */
public class ArrayListDemo {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// �������϶���
		ArrayList<Integer> list = new ArrayList<Integer>();
	    
		/*
		 *  ע�⣺ArrayList���е�add�����ķ�����Object������
		 *      ������涨ArrayList<Integer>�Ǹ�����������
		 *      ���÷���Ϳ����ƹ�����
		 */
		
		// ���÷����õ�class�ļ�����
		Class c = list.getClass();
		
		// ��÷���
	    Method m = c.getMethod("add", Object.class);
	    
	    // ���÷���
	    m.invoke(list, "hello");
	    
	    System.out.println(list);
	}
}
