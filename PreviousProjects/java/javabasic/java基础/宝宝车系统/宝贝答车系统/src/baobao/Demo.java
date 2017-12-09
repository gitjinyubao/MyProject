package baobao;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎进入宝贝答车系统：");
		System.out.println("您是否需要租车？  1:是  0:否  ");
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
			
			System.out.println("您可租车的类型以及价格表如下：");
			System.out.println("序号             车名                                   租金                          容量");
			System.out.println("1."+"       "+"奥迪A4"+"           "+A1.rizu()+"/天"+"                   "+A.Zairen()+"人");
			System.out.println("2."+"       "+"依维柯"+"                             "+L1.rizu()+"/天"+"                  "+L.Zaihuo()+"吨");
			System.out.println("3."+"       "+"金龙"+"                                   "+K1.rizu()+"/天"+"                    "+K.Zairen()+"人");
			System.out.println("4."+"       "+"马自达"+"                              "+M1.rizu()+"/天"+"                    "+M.Zairen()+"人");
			System.out.println("5."+"       "+"皮卡—雪"+"                            "+P1.rizu()+"/天"+"                   "+P.Zairen()+"人"+" "+P2.Zaihuo()+"吨");
			System.out.println("6."+"       "+"松花"+"                                   "+S.rizu()+"/天"+"                   "+S1.Zaihuo()+"吨");
			System.out.println("请您输入需要的车辆数:");
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
				   
				   System.out.println("请输入第"+i+"辆车的序号：");
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
			System.out.println("请输入租车天数：");
			   Scanner input3=new Scanner(System.in);
			   int c2=input3.nextInt();
			   System.out.println("您的账单为：");
			   System.out.println("一共可载人数："+Psum+"人");
			   System.out.println("一共可载吨数："+Lsum+"吨");
			   System.out.println("费用共计："+Msum+"元");
			   System.out.println("您租用车型及数量如下：");
			   System.out.println("奥迪："+G[0]+"辆"+"    ");
			   System.out.println("依维柯："+G[1]+"辆"+"    ");
			   System.out.println("金龙："+G[2]+"辆"+"    ");
			   System.out.println("马自达："+G[3]+"辆"+"    ");
			   System.out.println("皮卡—雪："+G[4]+"辆"+"    ");
			   System.out.println("松花: "+G[5]+"辆"+"    ");
			   
			   Date now=new Date();
			   SimpleDateFormat s=new SimpleDateFormat("yyyy年aa月dd日    hh时ss分mm秒");
				String Now=s.format(now);//此为String类型
				System.out.println(Now);
			   
		}
		else
		{
			System.out.println("宝贝答车系统欢迎你的下次光临");
		}
	}
}
