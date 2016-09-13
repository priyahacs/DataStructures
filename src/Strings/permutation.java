package Strings;

public class permutation {

	public static void main(String[] args) { 
		String str = "ABC";
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if(n==0)
			System.out.println(prefix);
		else
		{
			for(int i =0;i<str.length();i++)
			{
				
				permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
			}
		}
	}
}
