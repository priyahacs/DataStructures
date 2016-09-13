package Strings;

public class patternMatching {

	public static boolean check(String A, String B, int i, int j){
		
			
		int str1_length = A.length();
		int str2_length = B.length();
			
		if(i == str1_length && j == str2_length)
			return true;
		
		if(i == str1_length || j == str2_length) 
			return false;
			
			
		if(A.charAt(i) == '?' || A.charAt(i) == B.charAt(j))
			return check(A, B, i + 1, j + 1);
		
		else if(A.charAt(i) == '*') {
			if(i + 1 == str1_length)
				return true;
			else
				return check(A, B, i, j + 1) || check(A, B, i + 1, j);
			}

		return false;
	}
	
	public static void main(String[] args)
	{
		boolean res = check("g*ks", "geeks",0,0);
		System.out.println(res);
		
		boolean res1 = check("ge?ks*", "geeksforgeeks",0,0);
		System.out.println(res1);
		
		boolean res2 = check("g*k", "gee",0,0);
		System.out.println(res2);
		
		boolean res3 = check("*pqrs", "pqrst",0,0);
		System.out.println(res3);
		
		boolean res4 = check("abc*bcd", "abcdhghgbcd",0,0);
		System.out.println(res4);
	}
}
