package URL�ĳ��÷���;

import java.net.MalformedURLException;
import java.net.URL;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��URLʵ��
		try {
			URL u = new URL ("http://www.jinyubao.com");
			//�����Ѿ����ڵ�URL�����µ�URL����
			URL  u1=new URL(u,"/baobei.html?name=jinyubao#text");
			//?�����ʾ������#�����ʾ����
			System.out.println("Э�飺"+u1.getProtocol());
			System.out.println("������"+u1.getHost());
			System.out.println("�˿ڣ�"+u1.getPort());
			//���δָ���˿ںţ���ʹ��Ĭ�ϵĶ˿ںţ���ʱgetport()����ֵΪ-1
			System.out.println("�ļ�·����"+u1.getPath());
			System.out.println("�ļ�����"+u1.getFile());
			System.out.println("���·����"+u1.getRef());
			System.out.println("��ѯ�ַ�����"+u1.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
