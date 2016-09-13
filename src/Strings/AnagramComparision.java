package Strings;

public class AnagramComparision {
	
	public static boolean checkAnagram(String A, String B)
	{
		if(A.length() != B.length())
		{
			return false;
		}
		
		String test = ""+A.toLowerCase();
		A = A.toLowerCase();
		B = B.toLowerCase();
		
		for(int i=0; i<test.length()&&A.length()>0&&B.length()>0;i++)
		{
			String current = ""+test.charAt(i);
			if(A.indexOf(current) != -1)
			{
				A = A.replaceFirst(current,"");
				//System.out.println(A.indexOf(current));
			}
			if(B.indexOf(current) != -1)
			{
				B = B.replaceFirst(current,"");
			}
		}
		//System.out.println(A);
		if(A.length()== 0 && B.length()==0)
		{
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args)
	{
		String A = "Apple";
		String B = "elapp";
		
		boolean res = checkAnagram(A,B);
		if(res)
		{
			System.out.println("Yes they are anagrams");
		}
		else
		{
			System.out.println("Yes they are not anagrams");
		}
		
	}

}
