package waitAndNotifyModify;

/*
 * �ȴ����ѣ�
 *       Object�����ṩ������������
 *       	wait():�ȴ�
 *          notify():���ѵ����߳�
 *          notifyAll():�������е��߳�
 *       Ϊʲô��Щ������������Thread���У�
 *       ��Щ�����ĵ��ã�����ͨ����������ã������Ǹղ�ʹ�õ�������������������
 *       ������Щ�������붨����Object����
 *       
 * ���մ����У�
 *         ��Student�ĳ�ԱԱ������˽���ˡ�
 *         �����úͻ�ȡ�Ĳ�������װ���˹��ܣ����Ҽ���ͬ��
 *         ���û��߻�ȡ�ķ�������ֻ��Ҫ���÷�������
 *       
 */
public class test {
	
	public static void main(String[] args) {
	    Student s = new Student();
		SetStudent setStudent = new SetStudent(s);
		GetStudent getStudent = new GetStudent(s);
		setStudent.start();
		getStudent.start();
	}
}
