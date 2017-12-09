
import java.util.Scanner;
public class DFA {
public static char panduan(char g,char z)
{
	switch(g)
	{
	case 'S':
		if(z=='a')
			return 'U';
		else if(z=='b')
			return 'V';
		else
			return 'E';
	case 'U':
		if(z=='a')
			return 'Q';
		else if(z=='b')
			return 'V';
		else
			return 'E';
	case 'V':
		if(z=='a')
			return 'U';
		else if(z=='b')
			return 'Q';
		else
			return 'E';
	case 'Q':
		if(z=='a')
			return 'Q';
		else if(z=='b')
			return 'V';
		else
			return 'Q';
	
	}
	return 'E';
}
public static void main1(String []arg)
{
Scanner input=new Scanner(System.in);
System.out.println("请输入判定单词");
String text=input.next();
char g='S';
char z;
for(int i=0;i<text.length();i++)
{
	z=text.charAt(i);
	g=panduan(g,z);
}
if(g=='Q')
	System.out.println("单词合法");
else
	System.out.println("单词不合法");
}
}
