
import java.util.Scanner;

public class basic_operations
{
	public static void main(String[] args)
	{
		
		
		Scanner read1 = new Scanner(System.in);
		System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.OddOrEven 6.PrimeOrNot 7.PalindromeOrNot");
		System.out.print("Enter the option you want to perform:");
		int option = read1.nextInt();
		
		if(option < 1 || option > 7)
		{
			System.out.println("Invalid choice!!!");
			System.exit(0);
		}
		
		
		int number = 0;
	    int first = 0;
	    int second = 0;
	    String arr = "";
		
		if (option == 5 || option == 6)
		{
			
			Scanner read = new Scanner(System.in);
			System.out.print("Enter the number:");
			number = read.nextInt();
		}
		else if(option == 7)
		{
			Scanner read5 = new Scanner(System.in);
			System.out.print("Enter desired text:");
			arr = read5.nextLine();
			
		}
		else
		{
			
			Scanner read2 = new Scanner(System.in);
			System.out.print("Enter the first number:");
			first = read2.nextInt();
			
			Scanner read3 = new Scanner(System.in);
			System.out.print("Enter the second number:");
			second = read3.nextInt();
		
		}
		
		switch(option)
		{
		   case (1):
			   int add_value = add(first,second);
		       System.out.println("The add value is "+ add_value );
		       break;
		   case (2):
			   int sub_value = sub(first,second);
		       System.out.println("The sub value is "+ sub_value );
		       break;
		   case (3):
			   int mul_value = mul(first,second);
		       System.out.println("The product value is "+ mul_value );
		       break;
		   case (4):
			   int quo_value = quo(first,second);
		       System.out.println("The quo value is "+ quo_value );
		       break;
		   case (5):
			   oddoreven(number);
		       break;
		   case (6):
			   primeornot(number);
		       break;
		   case(7):
			   palindromeornot(arr);
		       break;
		}
		
	}
	static int add(int v1,int v2)
	{
		return (v1+v2);
		
	}
	static int sub(int v1,int v2)
	{
		return (v1-v2);
		
	}
	static int mul(int v1,int v2)
	{
		return (v1*v2);
		
	}
	static int quo(int v1,int v2)
	{
		return (v1/v2);
		
	}
	
	static void oddoreven(int v1)
	{
		if (v1%2 == 0)
		{
			System.out.println("The number "+v1+ " is even");
		}
		else
		{
			System.out.println("The number "+v1+" is Odd");
		}
		
	}
	static void primeornot(int v1)
	{
		boolean flag = false;
		
		for(int i = 2;i<=v1/2;i++)
		{
			if(v1%i == 0)
			{
				//System.out.println(i);
				flag = true;
				break;
			}
		}
		
		if(flag == true)
		{
			System.out.println("The number "+v1+ " is not a Prime Number");
		}
		else
		{
			System.out.println("The number "+v1+ " is Prime Number");
		}
		
	}
	static void palindromeornot(String num)
	{

		boolean flag = true;
		String copy = num;
		int length = copy.length();

		for (int j = length-1,i=0; j>=0 && i<length;j--,i++)
		{
			
			if(copy.charAt(j) != copy.charAt(i))
			{
				flag = false;
				break;
			}
		}
		
		if(flag == true)
		{
			System.out.println("The input  "+num+ " is a Palindrome");
		}
		else
		{
			System.out.println("The input "+num+ " is not a Palindrome");
		}
		
	}
	}
