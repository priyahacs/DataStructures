package Sorting;
import java.util.*;

public class Quick_Sort {
	/* Finding the pivot position and sorting accordingly
	 * Values greater than pivot is on the right side of pivot
	 * Values less then pivot are on left side
	 * return pivot position*/
	public static int PivotPartition(int[] A,int start,int end){
		int pivot = A[end];
		int pIndex = start;
		
		for(int i=start;i<end;i++)
		{
			if(A[i] <= pivot){
				int temp = A[i];
				A[i] = A[pIndex];
				A[pIndex] = temp;
			    pIndex ++;
			}
		}
		int temp = A[pIndex];
		A[pIndex] = A[end];
		A[end] = temp;
		
		return pIndex;
	}
	
	/*Call to find the pivot position
	 * Recursively call QuickSort for partition and Sorting of
	 * list before pivot element and list after pivot element*/
	
	public static void QuickSort(int[] A,int start,int end)
	{
		if(start < end){
			int partition = PivotPartition(A,start,end);
			QuickSort(A,start,partition-1);
			QuickSort(A,partition+1, end);
		}
	}
	
	public static void main(String[] args){
		int[] A = {7,2,1,6,8,5,3,4};
		System.out.println("Input:"+Arrays.toString(A));
		int start = 0;
		int end = A.length-1;
		QuickSort(A,start,end);
		System.out.println("Output:"+Arrays.toString(A));
	}

}
