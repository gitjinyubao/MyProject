package JinYuBao;
import java.util.Arrays;
public class HellWord 
{
    public static void main(String[] args) {
        
         // �������󣬶�����Ϊhello
        HellWord hello = new HellWord();
        
        // ���÷�����������ֵ�����ڱ�����
		int[] array = hello.getArray(8);
        
        // ������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(array));
		//������ʾ��������Ԫ��
		for(double e:array)
		{
			System.out.print(e+" ");
		}
	}

	/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
	public int[] getArray(int length) {
        // ����ָ�����ȵ���������
		int[] nums = new int[length];
        
        // ѭ���������鸳ֵ
		for (int i=0;i<length;++i)                                
        {
            nums[i]=(int)(Math.random() *100);
        } 
			// ����һ��100���ڵ������������ֵ�������ÿ����Ա
		return nums; // ���ظ�ֵ�������
	}
}