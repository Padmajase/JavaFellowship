// if else 1. Read a single Digit Number and write in word
import java.util.Scanner;
class Readsingledigit{
	public static void main(String args[])
	{
		System.out.println("Enter single ditit number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n == 1)
		{
			System.out.println("one");
		}
		else if(n == 2)
		{
			System.out.println("two");
		}
		else if(n == 3)
		{
			System.out.println("three");
		}
		else if(n == 4)
		{
			System.out.println("four");
		}
		else if(n == 5)
		{
			System.out.println("five");
		}
		else if(n == 6)
		{
			System.out.println("one");
		}
		else if(n == 7)
		{
			System.out.println("seven");
		}
		else if(n == 8)
		{
			System.out.println("eight");
		}
		else if(n == 9)
		{
			System.out.println("nine");
		}
		else
		{
			System.out.println("invalid number");
		}
	}

}