public class ArrayLargestElement {
	public static void main(String args[]) {
		int arr[] = new int[] {2,30,7,1,9,3};
		int max = 0;
		for (int i=0; i < arr.length; i++)
		{
			if (max < arr[i])
			{max = arr [i];}
		}
		System.out.println("maximum of array = " +max);
	}
}