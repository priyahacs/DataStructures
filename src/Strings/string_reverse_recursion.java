package Strings;
/*Write a recursive C function to print reverse of a given string*/
public class string_reverse_recursion {
	
	public static void string_reverse(String A, int index)
	{
		if(index<A.length())
		{
			string_reverse(A, index+1);
			System.out.print(A.charAt(index));
		}
		
	}
	
	public static void main(String[] args)
	{
		String A = "Geeks for Geeks";
		string_reverse(A,0);
	}

}
