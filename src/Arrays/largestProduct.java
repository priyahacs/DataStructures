package Arrays;

public class largestProduct {

	public static void main(String [] args)
	{
		int a [] ={1, 5, 9, 8, 2, 4,1, 8, 1, 2};
		int max = 1;
		int k = 6;
		int i= 0;
		int j = k-1;
		
		while(j< a.length)
		{
			int prod = 1;
			for (int q = i;q<=j;q++)
			{
				prod *= a[q];
				if(prod > max)
				{
					max = prod;
				}
				
			}
			i++;
			j++;
		}
		System.out.println(max);
	}
}
