package templateDemo;

/* ���ԭ�򣺹��޸ģ�����չ
 * ģ�����ģʽ��
 *           ���壺
 *               ����һ���㷨�ĹǼܣ��������У�������������㷨�ӳٵ�������
 *           �ŵ㣺
 *               �ڶ����㷨�Ǽܵ�ͬʱ�����Ժ�����ʵ�־�����㷨�������û�����������
 *           ȱ�㣺
 *               ����㷨�Ǽ����޸ĵĻ�������Ҫ�޸ĳ�����
 */
public class Test {
	
	public static void main(String[] args) {
		GetTimeTemplate gtOne = new ForTime();
		System.out.println("ʱ�䣺" + gtOne.getTime());
		System.out.println("===================================");
		GetTimeTemplate gtTwo = new WhileTime();
		System.out.println("ʱ�䣺" + gtTwo.getTime());
	}
}
