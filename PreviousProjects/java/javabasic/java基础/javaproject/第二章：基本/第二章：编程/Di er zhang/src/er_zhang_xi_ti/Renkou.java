package er_zhang_xi_ti;
import java.util.Scanner;
public class Renkou 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of years:");
		int year=input.nextInt();
		long currentPopulation=312_032_486;
		long second=year*365*24*60*60;
		double numberOfBirth=second/7;
		double numberOfDeath =second/13;
		double numberOfMover =second/45;
		double futurePopulation=currentPopulation+numberOfBirth-numberOfDeath;
		System.out.println("The population in"+year+"years is"+(long)futurePopulation);	
	}
}
