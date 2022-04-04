//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap
// Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian 
//calendar. So ensure to check for the same. Further, the Leap Year is a Year divisible by 4 
//and not 100 unless it is divisible by 400. For e.g. 1800 is not a Leap Year and 2000 is a 
//Leap Year.
import java.util.Scanner;
class Leapyear
{
	public static void main(String args[])
	{
		System.out.println("Enter Year");
		Scanner scan=new Scanner(System.in);
		long y=scan.nextLong();
		if( y >= 1582)
		{
			if( y%4 ==0 && y%400 == 0)
			{
				System.out.println(y+" is the leap Year");
			}
			else
			{
				System.out.println(y+" is not the leap Year");
			}	
		}
		else
		{
			System.out.println("invalid year entered");
		}
		
	}

}