package Arrays;
import java.util.Arrays;

public class rotation {
	
	public static void method1(int a[],int d)
	{
		int temp [] = new int[3];
		
		for(int i=0;i<d;i++)
		{
			temp[i] = a[i];
		}
		
		for(int i =0,k=0;i<a.length;i++)
		{
			if(i< a.length-d)
			{
				a[i] = a[i+3];
			}
			else
			{
				a[i] = temp[k];
				k++;
			}
		}
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(a).equals(Arrays.toString(b)) );
	}

	public static void method2(int a[],int b[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			 leftrotate(a);
			 System.out.println(Arrays.toString(a));
			 if(Arrays.toString(a).equals(Arrays.toString(b)))
					 {
				 		
				 		System.out.println("Yes");
				 		break;
					 }
			
		}
	}
	
	public static void leftrotate(int a[])
	{
		int temp = a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i] = a[i+1];
		}
		a[a.length-1] = temp;
	}
	
	
	public static void main(String args[])
	{
		int a [] = {1,2,3,4,5,6};
		int b [] = {6,1,2,3,4,5};
		int d = 3;
		//System.out.println(Arrays.toString(a));
		//method1(a,d);
		
		method2(a,b);
	}
}

