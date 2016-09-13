package Search_Techniques;

public class BinarySearch {
	
	/*Find the mid value by taking average of the start and end index
	 * Compare the value at the mid index and adjust accordingly the start and end value
	 * until the value is found or end < start*/
	public int Search(int[] A, int element){
		int index = -1;
		int start = 0;
		int end = A.length-1;
		int mid;
		while(start<end )
		{
			
			mid = (start+end)/2;
			
			if(A[mid] == element)
			{
				return mid;
			}
			else if(A[mid] < element)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		
		return index;
	}
	public static void main(String[] args)
	{
		int A[] = {10,14,19,26,27,31,33,35,42,44,78};
		int s= 9;
		BinarySearch bm = new BinarySearch();
		int index = bm.Search(A,s);
		if (index != -1)
		{
			System.out.println("Element "+s+" found at position "+(index+1));
		}
		else
		{
			System.out.println("Element not found"); 
		}
	}

}
