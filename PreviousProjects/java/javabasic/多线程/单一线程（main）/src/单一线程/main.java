package ��һ�߳�;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("�̵߳�����:");
		//ȡ�õ�ǰִ�е��߳�����
		System.out.println(Thread.currentThread().getName());
		//��ʾһ�������
		int j=0;
		while(true)
		{
			//int i=(int)(Math.random()*99);
			System.out.print(Math.random()*99+" ");
			//ÿ���10������ͣ2��
//			if(++j%10==0)
//			{
				Thread.sleep(2000);
//			}	
		}
	}
}
