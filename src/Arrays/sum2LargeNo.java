package Arrays;

public class sum2LargeNo {
	
	public static void main(String args[])
	{
		int a[] = {1,2,-3,90,8};
		int b1 = a[0];
		int b2=  a[1];
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i] > b1 && a[i] > b2 )
			{
				if(b1>b2)
				{
					b2 =a [i];
				}
				else
				{
					b1 = a[i];
				}
			}
			else if(a[i] > b2)
			{
				b2 = a[i];
			}
			else if(a[i] >b1)
			{
				b1 = a[i];
			}
		}
		
		System.out.println(b1+b2);
	}
}
