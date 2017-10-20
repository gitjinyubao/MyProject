package variableParameter;

/*
 * �ɱ������
 *       ���巽����ʱ��֪��Ҫ������ٸ�����
 *       ��ʽ��
 *          ���η� ����ֵ���� ������(��������...������){}
 *          ע�⣺
 *              ����ı�����ʵ����һ������
 *              ���һ�������пɱ�����������ж����������ô�ɱ����һ���������һ��
 */
public class demo1 {
	public static int addNum(Object...args)
	{
		int sum = 0;
		
		for (int i = 0; i < args.length; ++i)
		{
			sum +=  Integer.parseInt(args[i].toString());
		}
		
		return sum;
	}
	
	public static int add(int...args)
	{
		int sum = 0;
		if (args != null) {
			for (int a : args) {
				sum += a;
			}
		} else {
			sum = 0;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(addNum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(add(null));
	}
}
