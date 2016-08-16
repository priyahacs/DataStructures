package Arrays;
import java.util.Arrays;

public class MergingArrays {
	
	public static void moveToEnd(int a[], int size) 
    {
        int i = size - 1;
        int j = size - 1;
        while (i >=0)
        {
        	if(a[i] != -1)
        	{
        		a[j] = a[i];
        		j--;
        	}
        	i--;
        }
    }
	
	public static void merge(int big[],int small[])
	{
		int k = small.length;
		//int i =0;
		int j = 0;
		int size = big.length;
		
		for(int i = 0;i<size;i++)
		{
			if(k <size && big[k]<small[j] )
			{
				big[i] = big[k];
				k++;
				
			}
			else
			{
				big[i] = small[j];
				j++;
			}
		}
			
	}
 
	public static void main(String[] args) 
    {
		//MergingArrays mn = new MergingArrays();
         
        /* Initialize arrays */
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 25};
        int n = N.length;
        int m = mPlusN.length - n;
 
        /*Move the m elements at the end of mPlusN*/
        moveToEnd(mPlusN, m + n);
        
        System.out.println(Arrays.toString(mPlusN));
        
        merge(mPlusN,N);
        System.out.println(Arrays.toString(mPlusN));
    }
 

}
