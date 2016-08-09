package Sorting;
import java.util.*;



public class Bubble_Insert_Select {

	/*
	 * Starting from index 0, if current position i >i+1,swap
	 * Repeat for all elements
	 * Time complexity: O(n2)
	 * */
	public int[] bubble(int[] A){
		for (int i=0;i<A.length;i++)
		{
			for (int j =0; j<A.length-1;j++)
			{
				if(A[j] > A[j+1])
				{
					swap(A, j,j+1);	
				}
			}
		}
		
		return A;
	} 
	
	/*
	 * Select the minimum element from the list i+1 to n
	 * swap it with the current position(i)
	 * Repeat for all elements
	 * Time complexity: O(n2)
	 * */
	public int[] selection(int[] A)
	{
		for (int i=0;i<A.length-1;i++){
			int min = i,swaped = 0;
			for(int j=i+1;j<A.length;j++)
			{
				if (A[min] > A[j]){
					min = j;
					swaped = 1;
					}
			}
			if(swaped ==1){
				
				swap(A,i,min);
			}
		}
		return A;
	}
	/*Start from 2nd element and compare it with previous elements
	 * Insert the element at the correct order
	 * continue for all the elements
	 * Time complexity: O(n2)*/
	public int[] insertion(int[] A){
		
		for(int i=1;i<A.length;i++){
			
			int element = A[i], pos = i;
			while(pos > 0 && A[pos-1] >element )
			{
			A[pos] = A[pos-1];
			pos = pos-1;
			}
			A[pos] = element;
			}
		return A;
	}
	
	
	public void swap(int[] arr, int a, int b){

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;	
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your option for sorting: 1.Bubble 2. Selection 3.Insert:");
		int option = input.nextInt();
		int [] array = {29,6,0,5,3,24,3,2}; 
		/*System.out.println("Enter the length of the array:");
		int length = input.nextInt();
		System.out.println("Enter the elements of the array:");
		int [] array = new int[length]; 
		for (int i=0;i<length;i++)
		{
			array[i] = input.nextInt();
		}*/
		System.out.println("Input array:");
		System.out.println(Arrays.toString(array));
		Bubble_Insert_Select bis = new Bubble_Insert_Select();
		
		System.out.println("Sorted array:");
		if (option == 1){
			
			int[] sorted = bis.bubble(array); 	
			System.out.println(Arrays.toString(sorted));
			
		}else if(option ==2){
			int[] sorted = bis.selection(array); 
			System.out.println(Arrays.toString(sorted));
		}else if(option ==3){
			
			int[] sorted = bis.insertion(array); 
			System.out.println(Arrays.toString(sorted));
			
		}
			
			
	}

}
