// if else 2. Read a Number 1,10,100,1000 and display unit, ten hundred.
import java.util.Scanner;
class Unitten{
	public static void main(String args[])
	{
		System.out.println("Enter single digit number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n == 1)
		{
			System.out.println("unit");
		}
		else if(n == 10)
		{
			System.out.println("ten");
		}
		else if(n == 100)
		{
			System.out.println("hundred");
		}
		else if(n == 1000)
		{
			System.out.println("thousand");
		}
		else
		{
			System.out.println("invalid number");
		}
	}

}