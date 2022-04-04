// while loop 1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
import java.util.Scanner;
class Sumofnnumbers{
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number to get summation ");
		int n=scan.nextInt();
		while(i != n+1)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(" Sum of "+n+" numbers is "+sum);
	}
}