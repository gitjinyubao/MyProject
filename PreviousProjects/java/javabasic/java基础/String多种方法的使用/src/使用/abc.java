package ʹ��;

public class abc {
	
	    public static void main(String[] args) {
			// ����һ���ַ���
			String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
	        
	        // ���ִ���
			int num = 0;
	        
	         // ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
	        /* byte[] b=s.getBytes();
			for (int u=0;u<b.length;++u                          )
			{
	            // ��ȡÿ���ַ����ж��Ƿ����ַ�a
				if (b[u]==a)                 ) {
	                // �ۼ�ͳ�ƴ���
					num++; 
				}
			}*/
			for(int i=0;i<s.length();++i)
			{
				if(s.charAt(i)=='a')//ע���ַ�ʹ�õ�����������
				{
					num++;
				}
			}
			System.out.println("�ַ�a���ֵĴ�����" + num);
		}
	}
