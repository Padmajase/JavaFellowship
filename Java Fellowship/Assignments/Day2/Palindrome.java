// for loop 3. Write a Program to find Palindrome Number
import java.util.Scanner;
public class Palindrome   
{  
	public static void main(String[] args)   
	{  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to display its reverse ");
		int n = sc.nextInt();
		int number=n;
		int reverse = 0;  
		for( ;number != 0; number=number/10)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
		} 
		if(reverse == n)
		{  
			System.out.println("The given number "+n+" is palindrome ");  
		}  
		else
		{			
			System.out.println("The given number "+n+" is not palindrome ");
		}
	}
}
  