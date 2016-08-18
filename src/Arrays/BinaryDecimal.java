package Arrays;

import java.util.Stack;

public class BinaryDecimal {

	public static void decimalToBinary(int num)
	{
		Stack s1 = new Stack();
		
		while(true)
		{
			
			if(num ==1)
			{
				s1.push(num);
				break;
			}
			s1.push(num%2);
			num = num/2;
			
		}
		
		String s ="";
		while(!s1.isEmpty())
		{
			s += s1.pop();
			
		}
		
		System.out.println(s);
	}
	
	
	public static void main(String args[])
	{
		int a = 10000;
		
		String s = ""+a;
		System.out.println(Integer.parseInt(s,2));
		
		int ans = 0;
		int power = 0;
		while(true)
		{
			if(a == 0)
			{
				break;
			}
			else
			{
				int b = a%10;
				
				ans += b *Math.pow(2, power);
				
				a= a/10;
				power++;
				
			}
		}
		System.out.println(ans);
		
		decimalToBinary(8);
	}
}
