package Arrays;

import java.util.Arrays;

public class fibonacci {
	
	
	public static void generateFibonacci(int n)
	{
		int [] fibo = new int[n+1];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2;i<=n;i++)
		{
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
		
		System.out.println(Arrays.toString(fibo));
	}
	
	public static int generateFiboRecursion(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return generateFiboRecursion(n-1)+generateFiboRecursion(n-2);
		}
	}
	public static void main(String args[])
	{
		int n= 6;
		
		generateFibonacci(n);
		System.out.println(generateFiboRecursion(n));
	}

}
