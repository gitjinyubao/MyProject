package baobao;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ���뱦����ϵͳ��");
		System.out.println("���Ƿ���Ҫ�⳵��  1:��  0:��  ");
		int a;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		if(a==1)
		{
			//1.
			IZaike A=new AudiA4() ;
			Rizu A1=new AudiA4() ;
			//2.   
			IZaihuo L=new Iveco() ;
			Rizu L1=new Iveco() ;
			//3.
			IZaike K=new King_Long() ;
			Rizu K1=new King_Long() ;
			//4.
			IZaike M=new Mazda() ;
			Rizu M1=new Mazda() ;
			//5.	
			IZaike P=new Pickup_snow() ;
			Rizu P1=new Pickup_snow() ;
			IZaihuo P2=new Pickup_snow() ;
			//6.
			Rizu S=new Songhua_River() ;
			IZaihuo S1 =new Songhua_River() ;
			
			System.out.println("�����⳵�������Լ��۸�����£�");
			System.out.println("���             ����                                   ���                          ����");
			System.out.println("1."+"       "+"�µ�A4"+"           "+A1.rizu()+"/��"+"                   "+A.Zairen()+"��");
			System.out.println("2."+"       "+"��ά��"+"                             "+L1.rizu()+"/��"+"                  "+L.Zaihuo()+"��");
			System.out.println("3."+"       "+"����"+"                                   "+K1.rizu()+"/��"+"                    "+K.Zairen()+"��");
			System.out.println("4."+"       "+"���Դ�"+"                              "+M1.rizu()+"/��"+"                    "+M.Zairen()+"��");
			System.out.println("5."+"       "+"Ƥ����ѩ"+"                            "+P1.rizu()+"/��"+"                   "+P.Zairen()+"��"+" "+P2.Zaihuo()+"��");
			System.out.println("6."+"       "+"�ɻ�"+"                                   "+S.rizu()+"/��"+"                   "+S1.Zaihuo()+"��");
			System.out.println("����������Ҫ�ĳ�����:");
			int c;
			double Msum=0;
			int Psum=0;
			double Lsum=0;	
			Scanner input1=new Scanner(System.in);
			c=input1.nextInt();
			int [] G=new int[6];
			for(int u=0;u<=5;++u)
			   {
				   G[u]=0;	   
			   }
			for(int i=1;i<=c;i++)
			{
				   
				   System.out.println("�������"+i+"��������ţ�");
				   Scanner input2=new Scanner(System.in);
				   int c1=input2.nextInt();
				   switch(c1)
				   {
				        case 1: Msum=Msum+A1.rizu();Psum=Psum+A.Zairen();G[0]=G[0]+1;break;
				        case 2: Msum=Msum+L1.rizu();Lsum=Lsum+L.Zaihuo();G[1]=G[1]+1;break;
				        case 3: Msum=Msum+K1.rizu();Psum=Psum+K.Zairen();G[2]=G[2]+1;break;
				        case 4: Msum=Msum+M1.rizu();Psum=Psum+M.Zairen();G[3]=G[3]+1;break;
				        case 5: Msum=Msum+P1.rizu();Psum=Psum+P.Zairen();Lsum=Lsum+P2.Zaihuo();G[4]=G[4]+1;break;
				        case 6: Msum=Msum+S.rizu();Lsum=Lsum+S1.Zaihuo();G[5]=G[5]+1;break;
				   }
			}	
			System.out.println("�������⳵������");
			   Scanner input3=new Scanner(System.in);
			   int c2=input3.nextInt();
			   System.out.println("�����˵�Ϊ��");
			   System.out.println("һ������������"+Psum+"��");
			   System.out.println("һ�����ض�����"+Lsum+"��");
			   System.out.println("���ù��ƣ�"+Msum+"Ԫ");
			   System.out.println("�����ó��ͼ��������£�");
			   System.out.println("�µϣ�"+G[0]+"��"+"    ");
			   System.out.println("��ά�£�"+G[1]+"��"+"    ");
			   System.out.println("������"+G[2]+"��"+"    ");
			   System.out.println("���Դ"+G[3]+"��"+"    ");
			   System.out.println("Ƥ����ѩ��"+G[4]+"��"+"    ");
			   System.out.println("�ɻ�: "+G[5]+"��"+"    ");
			   
			   Date now=new Date();
			   SimpleDateFormat s=new SimpleDateFormat("yyyy��aa��dd��    hhʱss��mm��");
				String Now=s.format(now);//��ΪString����
				System.out.println(Now);
			   
		}
		else
		{
			System.out.println("������ϵͳ��ӭ����´ι���");
		}
	}
}
