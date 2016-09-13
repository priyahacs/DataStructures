package Arrays;
import java.util.*;

public class KMinElements {

	public static int get_max(int[] A)
	{
		int max_index =0;
		for(int i =1;i<A.length;i++)
		{
			if(A[i] > A[max_index])
			{
				max_index = i;
			}
			//temp[i] = A[i];
		}
		
		return max_index;
	}
	public static void main(String args[])
	{
		int[] A = {1, 23, 12, 9, 30, 2, 50};
		int k =3;
		int [] temp = new int[k];
		int max = Integer.MIN_VALUE;
		int max_i =  Integer.MIN_VALUE;
		
		for(int i =0;i<k;i++)
		{
			if(A[i] > max)
			{
				max = A[i];
				max_i = i;
			}
			temp[i] = A[i];
		}
		
		System.out.println(Arrays.toString(temp)+" "+ max);
		
		for(int i=k;i<A.length;i++)
		{
			if(A[i] < temp[max_i])
			{
				//max = A[i];
				temp[max_i] = A[i];
				int res = get_max(temp);
				max_i =  res;
			}
		}
		
		
		for(int s : temp)
			System.out.println(s);
	}
}
