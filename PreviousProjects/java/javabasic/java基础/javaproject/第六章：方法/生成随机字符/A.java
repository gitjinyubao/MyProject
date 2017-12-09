import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sum:");
		int a=input.nextInt();
		final int NuMBER_OF_CHARS=a;
		System.out.println("Enter the length:");
		int b=input.nextInt();
		final int CHARS_PER_LINE=b;
		for(int i=0;i<NuMBER_OF_CHARS;++i)
		{
			char ch=getRandomCharcter('a','z');
			if((i+1)%CHARS_PER_LINE==0)
			{
				System.out.println(ch);
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println("1-------------1");
		for(int i=0;i<NuMBER_OF_CHARS;++i)
		{
			char ch=getRandomDigitCharacter();
			if((i+1)%CHARS_PER_LINE==0)
			{
				System.out.println(ch);
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println("2-------------2");
		for(int i=0;i<NuMBER_OF_CHARS;++i)
		{
			char ch=getRandomCharacter();
			if((i+1)%CHARS_PER_LINE==0)
			{
				System.out.println(ch);
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println("3-------------3");
		for(int i=0;i<NuMBER_OF_CHARS;++i)
		{
			char ch=getRandomUpperCaseLatter();
			if((i+1)%CHARS_PER_LINE==0)
			{
				System.out.println(ch);
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println("4-------------4");
		for(int i=0;i<NuMBER_OF_CHARS;++i)
		{
			char ch=getRandomLowerCaseLetter();
			if((i+1)%CHARS_PER_LINE==0)
			{
				System.out.println(ch);
			}
			else
			{
				System.out.print(ch);
			}
		}
		System.out.println("5-------------5");
	}
	
	public static char getRandomCharacter(char ch3,char ch4)
		{
			return (char)(ch3+Math.random() *(ch4-ch3+1));
		}
	public static char getRandomLowerCaseLetter()
	{
		return getRandomLowerCaseLetter('a','z');
	}
	public static char getRandomUpperCaseLetter()
	{
		return getRandomLowerCaseLetter('A','Z');
	}
	public static char getRandomDigitCharacter()
	{
		return getRandomLowerCaseLetter('0','9');
	}
	public static char getRandomCharacter()
	{
		return getRandomLowerCaseLetter('\u0000','\uFFFF');
	}
}
