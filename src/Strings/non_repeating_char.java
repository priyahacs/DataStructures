package Strings;
import java.util.*;
/*Given a string, find the first non-repeating character in it.
 *  For example, if the input string is “GeeksforGeeks”, 
 * then output should be ‘f’ and if input string is “GeeksQuiz”
 * , then output should be ‘G’. complexity:O(n)*/
public class non_repeating_char {
	public static void main(String[] args)
	{
		String input = "GeeksffoorrGeeks";
		int [] count = new int[256];
		Arrays.fill(count,0);
		
		for(int i =0;i<input.length();i++)
		{
			count[input.charAt(i)]++;
			
		}
		for(int i =0;i<input.length();i++)
		{
			if(count[input.charAt(i)] ==1)
			{
				System.out.println(input.charAt(i));
				break;
			}
		}
	}

}
