package JinYuBao;

public class HelloWorld {
    public static void main(String[] args) {
        
		// �������󣬶�����Ϊhello
		HelloWorld hello = new HelloWorld();
		
        // ���÷������������ſγ̵ĳɼ�
		double avg=hello.calcAvg(94, 81);
        System.out.println(avg);
	}

	/*
	 * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
	 * ����һ���������������ķ����������������ſγ̵ĳɼ�
	 */
     public double calcAvg(int number,int numbers)
     {
          double avg=(number+numbers)/2.0;
          return avg;
     }
}
