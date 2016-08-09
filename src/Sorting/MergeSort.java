package Sorting;
import java.util.*;
public class MergeSort {
	/*Function for merging the two sorted array*/
	public static void Merge(int []B,int []C,int []A)
	{
		int b_len = B.length;
		int c_len = C.length;
		int i,j,k;
		i=j=k=0;
			
		while(i< b_len && j< c_len )
		{
			if(B[i] <= C[j])
			{
				A[k] = B[i];
				i++;
			}
			else{
				A[k] = C[j];
				j++;
			}
			k++;
		}
		
		while(i<b_len){
			A[k] = B[i];
			i++;
			k++;
		}
		while(j<c_len){
			A[k] = C[j];
			j++;
			k++;
		}
		
	}
	/*Recursive call for dividing the array and merging it*/
	public static void MergeSort(int [] A)
	{
		int n = A.length;
		if(n<2){
			return;
		}
		int mid = n/2;
		
		int [] B = new int[mid];
		int [] C = new int[n-mid];
		
		for(int i = 0;i<mid;i++)
		{
			B[i] = A[i];
		}
		int j = 0;
		for(int i = mid;i<n;i++)
		{
			C[j] = A[i];
			j++;
		}
		MergeSort(B);
		MergeSort(C);
		
		Merge(B,C,A);
		
	}

	public static void main(String[] args){
		int [] A = {7,2,1,6,8,5,3,6,5,4};
		MergeSort(A);
		System.out.println(Arrays.toString(A));
	}
}
