package view;

import java.sql.SQLException;
import java.util.Scanner;

import contral.Doentity;
import entitty.Classes;

public class View {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//�˵�ѡ��
		
		String   Start1="��ӭ�������༶��Ϣϵͳ  \n"+
		                "�������� 1 ������Ӱ༶��Ϣ\n"+"���� 2 ���и��İ༶��Ϣ \n"+"���� 3���в�ѯ�༶��Ϣ \n"+"���� 4 ����ɾ���༶��Ϣ \n";
		System.out.println(Start1);
		Scanner   in=new Scanner(System.in); 
		System.out.println("-----------------");
		while(true){
		System.out.println("���������֣�");
		int  number=in.nextInt();
		if(number==1)
		{
			System.out.println("������༶��ţ�int�ͣ���");
			int number1=in.nextInt();
			System.out.println("������༶���ƣ�String�ͣ��ַ������Ϊ40����");
			String  name=in.next();
			System.out.println("������༶������int�ͣ���");
			int num=in.nextInt();
			Classes  c=new Classes(number1,name,num);
	        Doentity.addclass(c);
		}
		if(number==2)
		{
			System.out.println("��������Ҫ���ĵİ༶��ţ�int�ͣ���");
			int num1=in.nextInt();
			System.out.println("������༶��ţ�int�ͣ���");
			int number1=in.nextInt();
			System.out.println("������༶���ƣ�String�ͣ��ַ������Ϊ40����");
			String  name=in.next();
			System.out.println("������༶������int�ͣ���");
			int num=in.nextInt();
			Classes  c=new Classes(number1,name,num);
	        Doentity.updateClasses(c, num1);
		}
		if(number==3)
		{
			System.out.println("��������Ҫ��ѯ�İ༶��ţ�int�ͣ���");
			int num1=in.nextInt();
			 System.out.println(Doentity.queryClasses(num1).toString());	
		}
		if(number==4)
		{
			System.out.println("��������Ҫɾ���İ༶��ţ�int�ͣ���");
			int num1=in.nextInt();
			 Doentity.deleteClasses(num1);
		}	
		}
/*		//��Ӱ༶��Ϣ
		System.out.println("��������������������������������������������������Ӱ༶��Ϣ");
        Classes  c=new Classes(102,"javaSE",30);
        Doentity.addclass(c);
        
        //���İ༶��Ϣ
        System.out.println("���������������������������������������������������İ༶��Ϣ");
        Classes   c1=new   Classes(101,"javaEE",28);
        Doentity.updateClasses(c1, 101);
        
		//��ѯ�༶��Ϣ
        System.out.println("��������������������������������������������������ѯ�༶��Ϣ");
        System.out.println(Doentity.queryClasses(101).toString());
        
        //ɾ���༶��Ϣ
        System.out.println("������������������������������������������������ɾ���༶��Ϣ");
        Doentity.deleteClasses(103);
  */      
	}
}
