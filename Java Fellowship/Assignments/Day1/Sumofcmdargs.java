//1.4 To find the sum of command-line arguments and count the invalid integers entered.
import java.util.Scanner;
public class Sumofcmdargs
{
	public static void main(String[] args)
	{
		
  		int a=Integer.parseInt(args[1]); // storing args[0] value in a
  		int b=Integer.parseInt(args[0]); // storing args[1] value in b
		int sum1=a+b;
		System.out.println("sum 1 = "+sum1);

		Scanner scan = new Scanner(System.in);
		System.out.println("enter first integer");
		int x=scan.nextInt();
		System.out.println("enter second integer");
		int y=scan.nextInt();
		int sum2=x+y;
		System.out.println("sum2 = "+sum2);
	}	
}