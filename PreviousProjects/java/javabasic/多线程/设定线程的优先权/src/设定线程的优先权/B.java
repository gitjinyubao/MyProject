package �趨�̵߳�����Ȩ;

public class B implements Runnable
{
	private long counter;
	public boolean flag;
	public B()
	{
		counter =0;
		flag=true;
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(flag)
		{
				++counter;
		}
	}//while���Ƿ���������д�ڷ�����
	public void Ting()
	{
		flag=false;
	}
	public long Counter()
	{
		return counter;
	}
	
}
