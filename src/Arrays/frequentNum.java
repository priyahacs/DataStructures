package Arrays;
import java.util.*;
public class frequentNum {

	public static void main(String args[])
	{
		
		int a[] = {3,3,4,3,4,4,3,4,4,3};
		int max =0 ;
		int maxInt = a[0]; 
		
		HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int value = 0;
			if(hp.containsKey(a[i]))
			{
				value = hp.get(a[i])+1;
			}
			else value = 0;
			
			hp.put(a[i], value);
			if(value > max)
			{
				max = value;
				maxInt = a[i];
			}
			
		}
		
		System.out.println(maxInt);
	}
}
