package file_handling;

public class justification {
	public static void main(String[] args)
	{
		/*String A = "helloehieeekadadf";
		int max = 10;
		char[] B = A.toCharArray();
		
		int count  = 0;
		
		for(char b : B)
		{
			if(count <max)
			{
				System.out.print(b);
				count += 1;
			}
			else
			{
				System.out.println();
				count = 0;
			}
		}*/
		
		
		String C = "A house on the haunted hill";
		String[] test = C.split("\\s");
		
		int c1 = 0;
		int max  = 20;
		
		for(String temp : test )
		{
			//System.out.print(temp);
			int a = temp.length();
			//System.out.print(c1+a);
			if((c1+a) <= max)
			{
				if(c1+a == max)
				{
					
					System.out.print(temp);
					c1+= a;
				}
				else
				{
					System.out.print(temp+" ");
					c1+= a+1;
				}
			}
			else
			{
				System.out.println();
				System.out.print(temp+" ");
				c1 = a+1;
			}
			
		}
		
	}

}
