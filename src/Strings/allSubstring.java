package Strings;

public class allSubstring {

	public static void main(String [] args)
	{
		String A = "fun";
		
		for(int i =0;i<A.length();i++)
		{
			for(int j = i+1;j<=A.length();j++)
			{
				System.out.println(A.substring(i,j));
			}
		}
	}
}
