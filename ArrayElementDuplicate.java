// 6)

class ArrayElementDuplicate {
	public static void main(String args[] )
	{
		int arr[] = new int[] {7,2,2,8, 6, 7, 8, 9, 1};

		System.out.println(" Duplicate Array Elements are  :");
		
		int dupli = arr [0];
		for(int i = 1; i < arr.length; i ++ )
		{
			if( dupli == arr [i])
			{
				dupli = arr [i];
				System.out.println(arr[i]);
			}
		}
	}
}
