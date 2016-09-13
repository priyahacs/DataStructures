package Arrays;
import java.util.*;
public class rotation_how {
/*a sorted array of numbers which you don't know what the content is,
 *  that array is rotated an unknown number of times, and you end up with another array
 *  . Find out how many times you have
 *  to rotate it back to put it back like how it was. */
	
	public static void rotate(int[] B)
	{
		int temp = B[0];
		for(int i=0;i<B.length-1;i++)
		{
			B[i] = B[i+1];
		}
		B[B.length-1] = temp;
	}
	
	
	public static void main(String args[])
	{
		int[] A = {1,2,3,4,5,6,7};
		
		int [] B = {5,6,7,1,2,3,4};
		//int [] B = {1,2,3,4,5,6,7};
		//int [] B = {7,1,2,3,4,5,6};
		/*Find the smallest element*/
		int min = B[0];
		int index = 0;
		for(int i=0;i<B.length;i++)
		{
			if(B[i]<min)
			{
				min = B[i];
				index = i;
			}
			
		}
		
		System.out.println(min+" "+index);
		
		int rotate_num = index;
		
		System.out.println(rotate_num);
		
		
		while( rotate_num>0)
		{
			rotate(B);
			rotate_num--;
		}
		
		System.out.println(Arrays.toString(B));
	}
}
