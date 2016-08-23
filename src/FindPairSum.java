package Arrays;

import java.util.*;
public class FindPairSum {
	public static void main(String args[])
	{
		int a[] = {8,4,45,6,2,-8};
		int sum = 10;
		Set hash = new HashSet<Integer>();
		
		for (int value : a){
			int target = sum - value;
			
			if(hash.contains(target))
			{
				System.out.printf("%d %d",value,target);
				
			}
			hash.add(value);
			
		}
		
	}

}
