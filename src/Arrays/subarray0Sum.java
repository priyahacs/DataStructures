package Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
class Range{
	
	int from;
	int to;
	
	Range(int from, int to)
	{
		this.from = from;
		this.to = to;
	}
	
	int getFrom()
	{
		return this.from;
	}
		
	int getTo()
	{
		return this.to;
	}
}

public class subarray0Sum {
	

	public static void method2(int arr[])
	{
		
		Vector<Range> ranges  = new Vector<Range>();
		Map <Integer, ArrayList> mp1 = new HashMap<Integer,ArrayList>();
		
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			
			if(sum == 0)
			{
				Range r1 = new Range(0,i);
				ranges.add(r1);
			}
			
			if(mp1.get(sum)!= null)
			{
				List<Integer> list = mp1.get(sum);
				Iterator<Integer> itr= list.iterator();
				while(itr.hasNext()){
					Range r1 = new Range(itr.next()+1,i);
					ranges.add(r1);}
				mp1.get(sum).add(i);
				
			}
			else{
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				mp1.put(sum, list);
				
					
				}
				
				
			}
		
		Iterator<Range> ans = ranges.iterator();
		while(ans.hasNext())
		{
			Range range = ans.next();
			System.out.println("index from"+range.getFrom()+"to"+range.getTo());
		}
		
	}
	
	public static void main(String[] args)
	{
		Map <Integer, List> mp1 = new HashMap<Integer,List>();
		Map <Integer, ArrayList<Integer>> mp2 = new HashMap<Integer,ArrayList<Integer>>();
		int [] arr = {6, 3, -1, -3, 4, -2, 2,
	             4, 6, -12, -7};
		int sum = 0;
		int count = 1;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			
			if(sum == 0)
			{
				ArrayList<Integer> l1 = new ArrayList<Integer>();
				l1.add(0);
				l1.add(i);
				mp2.put(count,l1);
				count++;
				System.out.println(l1);
			}
			
			if(mp1.get(sum)!= null)
			{
				List<Integer> list = mp1.get(sum);
				Iterator<Integer> itr= list.iterator();
				while(itr.hasNext()){
					ArrayList<Integer> l1 = new ArrayList<Integer>();
					l1.add(itr.next()+1);
					l1.add(i);
					mp2.put(count,l1);
					count++;
					System.out.println(l1);
				}
				mp1.get(sum).add(i);
			}
			else{
			List<Integer> list = new ArrayList<Integer>();
			list.add(i);
			mp1.put(sum, list);
		}}
		
		method2(arr);
	}

}
