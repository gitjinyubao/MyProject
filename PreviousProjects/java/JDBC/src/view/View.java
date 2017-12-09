package view;

import java.sql.SQLException;
import java.util.Scanner;

import contral.Doentity;
import entitty.Classes;

public class View {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//菜单选项
		
		String   Start1="欢迎您到来班级信息系统  \n"+
		                "输入数字 1 进行添加班级信息\n"+"数字 2 进行更改班级信息 \n"+"数字 3进行查询班级信息 \n"+"数字 4 进行删除班级信息 \n";
		System.out.println(Start1);
		Scanner   in=new Scanner(System.in); 
		System.out.println("-----------------");
		while(true){
		System.out.println("请输入数字：");
		int  number=in.nextInt();
		if(number==1)
		{
			System.out.println("请输入班级编号（int型）：");
			int number1=in.nextInt();
			System.out.println("请输入班级名称（String型，字符数最大为40）：");
			String  name=in.next();
			System.out.println("请输入班级人数（int型）：");
			int num=in.nextInt();
			Classes  c=new Classes(number1,name,num);
	        Doentity.addclass(c);
		}
		if(number==2)
		{
			System.out.println("请输入需要更改的班级编号（int型）：");
			int num1=in.nextInt();
			System.out.println("请输入班级编号（int型）：");
			int number1=in.nextInt();
			System.out.println("请输入班级名称（String型，字符数最大为40）：");
			String  name=in.next();
			System.out.println("请输入班级人数（int型）：");
			int num=in.nextInt();
			Classes  c=new Classes(number1,name,num);
	        Doentity.updateClasses(c, num1);
		}
		if(number==3)
		{
			System.out.println("请输入需要查询的班级编号（int型）：");
			int num1=in.nextInt();
			 System.out.println(Doentity.queryClasses(num1).toString());	
		}
		if(number==4)
		{
			System.out.println("请输入需要删除的班级编号（int型）：");
			int num1=in.nextInt();
			 Doentity.deleteClasses(num1);
		}	
		}
/*		//添加班级信息
		System.out.println("————————————————————————添加班级信息");
        Classes  c=new Classes(102,"javaSE",30);
        Doentity.addclass(c);
        
        //更改班级信息
        System.out.println("————————————————————————更改班级信息");
        Classes   c1=new   Classes(101,"javaEE",28);
        Doentity.updateClasses(c1, 101);
        
		//查询班级信息
        System.out.println("————————————————————————查询班级信息");
        System.out.println(Doentity.queryClasses(101).toString());
        
        //删除班级信息
        System.out.println("————————————————————————删除班级信息");
        Doentity.deleteClasses(103);
  */      
	}
}
