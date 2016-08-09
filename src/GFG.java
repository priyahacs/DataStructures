import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class GFG {
	
 static int getMax(int length, int[] input)
	{
	 int max = 0;
	 int value;
	 HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
	 
	 for (int element: input)
	 {
		 if (hp.containsKey(element))
		 {
			 value = hp.get(element) + 1;
			 hp.put(element, value);
			 
		 }
		 else
		 {
			 value = 1;
			 hp.put(element, value);
		 }
		 if(value > length/2)
		 {
			 max = element;
			 return max;
		 }
		 
	 }
	 
	 return max;
		
	}
	
	public static void main (String[] args) {
	    
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int i =0; i<a;i++ )
		{
			int arr_length = input.nextInt();
			int [] arr_samp = new int[arr_length];
			
			for(int j =0;j<arr_samp.length;j++)
			{
				arr_samp[j] = input.nextInt();
			}

			int max = getMax(arr_samp.length, arr_samp);
			
			if(max != 0){
				System.out.println(max);
			}
			else{
				System.out.println("NO Majority Element");
			}
			
		}
		
	}
}