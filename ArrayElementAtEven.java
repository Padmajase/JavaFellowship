// 4) Java Program to print the smallest element in an array

public class ArrayElementAtEven
{
	public static void main (String args[])
	{
		
		int Arr[] = new int [] {28,9,4,5,6};
		int min = Arr[0];

		for (int i = 0; i<Arr.length; i++) 
		{
			if ( (i % 2) == 0 )
				System.out.println(" Array Element At Even position  " +Arr[i] );

		}
	}
}