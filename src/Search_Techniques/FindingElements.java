package Search_Techniques;

public class FindingElements {
	
	public static void main(String[] args){
		int[] A = {9,5,6};
		int[] B = {6,5};
		int X =0,Y = 0;
		
		for(int i=0;i<A.length;i++)
		{
			X ^= A[i];
		}
		System.out.println(X);
		for(int i=0;i<B.length;i++)
		{
			Y ^= B[i];
		}
		System.out.println(Y);
		System.out.println(X^Y);
	}

}
