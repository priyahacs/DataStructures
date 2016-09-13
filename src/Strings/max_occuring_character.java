package Strings;

public class max_occuring_character {
	public static void main(String[] args)
	{
		String A = "aa c sss  cc";
		
		int[] count = new int[256];
		
		int max = 0;
		char res  = Character.MAX_VALUE;
		//count[A.charAt(0)]++;
		for(int i=0;i<A.length();i++)
		{
			//count[A.charAt(i)]++;
			int index  = (int)A.charAt(i);
			System.out.println(index);
			count[index]++;
			if(count[index]> max)
			{
				max = count[index];
				res = A.charAt(i);
			}
		}
		
		System.out.println("MAX char is:"+res);
 	}

}
