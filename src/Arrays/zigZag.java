package Arrays;
import java.util.*;

public class zigZag {
	
	/*Convert to zig-zag like a<b>c<d*/
	public static void main(String[] args)
	{
		int a[] = {4, 3, 7, 8, 6, 2, 1};
		
		boolean flag = true;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(flag)
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			else
			{
				if(a[i]<a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					
				}
			}
			flag = !flag;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
