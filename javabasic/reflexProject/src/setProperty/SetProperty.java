package setProperty;

import java.lang.reflect.Field;

public class SetProperty {
	
	public static void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		// ���ݶ���������ֽ����ļ�����
		Class c = obj.getClass();
		
		// �õ���Ա����
		Field f = c.getDeclaredField(propertyName);

		// ȡ�����ʼ��
		f.setAccessible(true);
		
		// �����Ը�ֵ
		f.set(obj, value);
	}
}
