package Arrays;


import java.util.*;

public class checkUnique {

	public static boolean check_unique(String input)
	{
		if(input.length() > 256){
			
			return false;
		}
		
		boolean [] check = new boolean[256];
		
		/*for(int i=0;i<input.length();i++)
		{
			if(check[input.charAt(i)])
			{
				return false;
			}
			
			check[input.charAt(i)] = true;
		}
		*/
		for(int i=0;i<input.length();i++)
		{
			char c = input.charAt(i);
			//int a = input.indexOf(c);
			int b = input.lastIndexOf(c);
			if(i != b)
			{
				return false;
			}
			
		}
		
		
		return true;
	}
	
	
	public static String compression(String input)
	{
		StringBuffer result = new StringBuffer();

		int count = 0;
		for(int i =0;i<input.length();i++)
		{
			if(i ==0)
			{
				result.append(input.charAt(i));
				count =1;
			}
			else
			{
				if(input.charAt(i) == input.charAt(i-1))
				{
					count ++;
				}
				else
				{
					result.append(count);
					result.append(input.charAt(i));
					count = 1;
					
				}
			}
			
		}
		result.append(count);
		return result.toString();
	}
	
	
	public static void main(String[] args)
	{
		String A ="hewld2A";
		
		boolean result = check_unique(A);
		
		if(result)
		{
			System.out.println("Yes,String has Unique characters");
		}
		else{
			System.out.println("No, String don't have Unique characters");
		}
		
		/*Routine for String compression using count of repeated characters*/
		
		String B ="abbccccaaa";
		String result1 = compression(B);
		System.out.println(result1);
		
	}
}
