package LinkedList;
import java.util.*;

class Node{
	
	int num;
	Node next;
	
	Node(int num,Node next)
	{
		this.num = num;
		this.next = next;
	}
	
	
	void insertAtTail(Node n)
	{
		Node head = this;
		
		
		while(head.next != null)
		{
			head = head.next;
		}
		
		head.next = n;
	}
	
	void printElements()
	{
		Node head = this;
		
		while(head != null)
		{
			System.out.print(head.num+" ");
			head = head.next;
		}
	}
}


public class LinkedListPractise{
	
	/*Program to detect the duplicates in a unsorted array*/
	public static Node deleteDuplicates(Node head)
	{
		Node current = head;
		Node prev = null;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

		while(current != null)
		{
			int data =  current.num;
			
			if(hm.containsKey(data)){
				prev.next = current.next;
				
			}
			else
			{
				hm.put(current.num,0);
				prev = current;	
			}
			current = current.next;
			
		}
		
		return head;
	}
	
	/*Finding the kth element from the last*/
	
	public static int findKthElement(Node head,int k)
	{
		//System.out.println(head.num);
		Node current = head;
		int count = 0;
		if(head == null){
			return 0;
		}
		while(current != null)
		{
			count++;
			current = current.next;
		}
		Node current1 = head;
		for(int i=0;i<(count-k-1);i++)
		{
			current1 = current1.next;
		}
		//System.out.println(current1.num);
		return current1.num;
	}

	
	
	
	/*Program to find sum of two numbers in the string, which is in the reverse order
	 * eg: <7 1 6> + <5 9 2> = <2 1 9>*/
	
	public static Node sumOfTwoLists(Node n1,Node n2){
		
		Node result = null;
		
		Node l1 =  n1;
		Node l2 = n2;
		int carry = 0;
		
		while(l1 !=null || l2!=null )
		{
			int sum = 0;
			
			if(l1!= null && l2 != null)
			{
				sum = l1.num +l2.num +carry;
				l1 = l1.next;
				l2 = n2.next;
			}
			else if(l1 == null && l2 != null)
			{
				sum = l2.num+ carry;
				l2= l2.next;
			}
			else
			{
				sum = l1.num+carry;
				l1 = l1.next;
			}
			
			int value = sum % 10;
			carry = sum>=10?1:0;
			
			System.out.println("value:"+ value);
			System.out.println("carry:"+ carry);
			Node ass = new Node(value,null);
			//result.insertAtTail(ass);
			
			if(result == null)
			{
				result = ass;
			}
			else
			{
				result.next = ass;
			}
			
			
			
		}
		
		
		return result;
	}
	
	public static Node detectCycle(Node head)
	{
		Node slow = head;
		Node fast = head;
		System.out.println("hi");
		while(fast != null && fast.next !=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				break;
			}
		}
		
		if( fast== null || fast.next == null)
		{
			System.out.println("hi");
			return null;
		}
		slow = head;
		Node prev = null;
		while(slow != fast)
		{
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		prev.next = null;
		return head;
		
	}
	
	public static boolean checkPalindrome1(Node head){
		
		Node slow = head;
		Node fast = head;
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		while(fast != null && fast.next != null)
		{
			s1.push(slow.num);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if (fast != null)
		{
			slow = slow.next;
		}
		while(slow != null)
		{
			if(s1.isEmpty())
			{
				return false;
			}
			int a = s1.pop().intValue();
			if(slow.num != a)
			{
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}
	
	public static boolean checkPalindrome2(Node head){
		
		Node current = head;
		Node l2 = null;
		int count =0;
		while(current != null)
		{
			Node add = new Node(current.num,l2);
			l2 = add;
			current = current.next;
			count ++;
		}
		
		if(count % 2 ==0)
		{
			count = count/2;
		}
		else
		{
			count = ((count+1)/2) -1;
		}
		
		Node s1 = head;
		Node s2 = l2;
		
		while(count >0)
		{
			if(s1.num != s2.num)
			{
				return false;
			}
			
			s1 = s1.next;
			s2= s2.next;
			count --;
		}
		
		l2.printElements();
		
		return true;
	}
	
	
	/*Driver function to test all the functions of the linked list*/
	public static void main(String[] args)
	{
		Node A = new Node(0,null);
		Node B = new Node(1,null);
		Node C = new Node(2,null);
		Node D = new Node(2,null);
		Node E = new Node(3,null);
		Node F = new Node(0,null);
		//E.next = C
		
		Node head = A;
		
		A.insertAtTail(B);
		A.insertAtTail(C);
		A.insertAtTail(D);
		A.insertAtTail(E);
		A.insertAtTail(F);
		
		
		//A.printElements();
		
		//Node result = deleteDuplicates(head);
		//A.printElements();
		
		/*int k = 4;
		
		int result_1 = findKthElement(head,k);
		System.out.println(result_1);*/
		
		/* Finding sum of 2 lists
		 * Node l1 = new Node(7,null);
		//Node l2 = new Node(4,null);
		
		Node l3 = new Node(1,null);
		Node l4 =  new Node(4,null);
		
		//l1.insertAtTail(l2);
		l3.insertAtTail(l4);

		Node result = sumOfTwoLists(l1,l3);
		result.printElements();
		*/
		
		/*Detect the loop and remove it
		Node s1 = detectCycle(head);
		s1.printElements();		*/
	
		
		/* Check whether the given list is  palindrome*/
		
		//boolean result = checkPalindrome1(head);
		//System.out.println(result);
		//head.printElements();
		
		boolean result2 = checkPalindrome2(head);
		System.out.println(result2);
		
	}
}