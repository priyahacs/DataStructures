package Search_Techniques;

public class FindingElements {
	
	public static void main(String[] args){
		int[] A = {9,5,6};
		int[] B = {6,5,9,54};
		int X =0;
		
		for(int i=0;i<A.length;i++)
		{
			X ^= A[i];
		}
		
		for(int i=0;i<B.length;i++)
		{
			X ^= B[i];
		}
		System.out.println(X);
		
	}

}
