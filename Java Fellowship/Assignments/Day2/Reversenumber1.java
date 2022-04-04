// for loop 2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;
public class Reversenumber1   
{  
	public static void main(String[] args)   
	{  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to display its reverse ");
		int number = sc.nextInt();
		int reverse = 0;  
		for( ;number != 0; number=number/10)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
		}   
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  