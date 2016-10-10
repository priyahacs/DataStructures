package Trees;
import java.util.*;
public class BinarySearchTreePractise {
	
	int count = 0;
	static int sizeleaf = 0; 
	public BinaryTreeNode insertNode(BinaryTreeNode root, int data)
	{
		if (root == null)
		{
			root =  new BinaryTreeNode(data);
		}
		else if(data <= root.getData())
		{
			root.setLeft(insertNode(root.getLeft(),data));
		}
		else
		{
			root.setRight(insertNode(root.getRight(),data));
		}
		return root;
	}
	
	
	
	/*left-root-right*/
	public void inOrder(BinaryTreeNode root)
	{
		if(root !=null )
		{
			inOrder(root.getLeft());
			System.out.println(root.getData());
			count++;
			inOrder(root.getRight());
		}
		
	}
	
	
	
	/*-root-left-right*/
	public void preOrder(BinaryTreeNode root)
	{
		if(root !=null )
		{
			System.out.println(root.getData());
			
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
		
	}
	
	
	/*left-right-root*/
	public void postOrder(BinaryTreeNode root)
	{
		if(root !=null )
		{
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getData());
		}
		
	}
	
	
	/*level-order-traversal*/
	public void levelOrder(BinaryTreeNode root)
	{
		Queue<BinaryTreeNode> qm = new LinkedList<BinaryTreeNode>();
		
		if(root !=null)
		{
			qm.offer(root);
			
			while(!qm.isEmpty())
			{
				BinaryTreeNode temp = qm.poll();
				System.out.println(temp.getData());
				if(temp.getLeft() != null)
				{
					qm.offer(temp.getLeft());
				}
				if(temp.getRight() != null)
				{
					qm.offer(temp.getRight());
				}
				
			}
		}
		else
		{
			System.out.println("NO ELEMENTS TO PRINT/TREE EMPTY");
		}
		
	}
	
	
	/* Check the tree is identical in all aspects*/
	public boolean checkIdentical(BinaryTreeNode root1, BinaryTreeNode root2)
	{
		if(root1 == null && root2 == null)
		{
			return true;
		}
		
		if(root1 != null && root2 != null)
		{
			return(root1.getData() == root2.getData() && 
			checkIdentical(root1.getLeft(),root2.getLeft()) &&
			checkIdentical(root1.getRight(),root2.getRight()));
		}
		
		return false;
	}
	
	
	/*Given two Binary Trees, write a function that returns true 
	 * if two trees are mirror of each other, else false. For example, 
	 * the function should return true for following input trees.*/
	public boolean checkMirror(BinaryTreeNode root1, BinaryTreeNode root2)
	{
		if(root1 == null && root2 == null)
		{
			return true;
		}
		
		if(root1 != null && root2 != null)
		{
			return (root1.getData() == root2.getData() &&
					checkMirror(root1.getLeft(),root2.getRight())&&
					checkMirror(root1.getRight(),root2.getLeft()));
		}
		return false;
	}
	
	
	
	
	
	/* Calculate height recursively
	 * max_depth = max(max depth of left subtree,  
                      max depth of right subtree) 
                      + 1*/
	public int calculateHeight(BinaryTreeNode root)
	{
		/*Height of empty tree is 0, could be -1 also*/
		if(root == null)
		{
			return 0;
		}
		return Math.max(calculateHeight(root.getLeft()),calculateHeight(root.getRight()))+1;
	}
	
	
	/*Calculate size of leaf nodes*/
	public int sizeOfLeaf(BinaryTreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		
		if(root.getLeft() == null && root.getRight() == null)
		{
			return 1;
		}
		else
		{
				return(sizeOfLeaf(root.getLeft()) + sizeOfLeaf(root.getRight()));
		}
		
		
	}
	
	/*Sum of the whole tree*/
	
	public int sumOfTree(BinaryTreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		return(root.getData()+ sumOfTree(root.getLeft())+ sumOfTree(root.getRight()));
	}
	
	
	/*Total number of nodes/ size of the tree*/
	
	public int totalNoNodes(BinaryTreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		return (totalNoNodes(root.getLeft())+ totalNoNodes(root.getRight())+1);
	}
	
	public BinaryTreeNode searchBST(BinaryTreeNode root, int num)
	{
		BinaryTreeNode temp = root;
		
		while(temp !=null && temp.getData() != num)
		{
			if(num < temp.getData())
			{
				temp = temp.getLeft();
			}
			else
			{
				temp = temp.getRight();
			}
		}
		
		return temp;
	}
	
	
	/*Least common ancestor*/
	
	public BinaryTreeNode LCA(BinaryTreeNode root, int n1, int n2)
	{
		if(root == null)
			return root;
		
		if(root.getData() > n1 &&root.getData() > n2 )
			return LCA(root.getLeft(),n1,n2);
		
		if(root.getData()< n1 &&root.getData()< n2 )
			return LCA(root.getRight(),n1,n2);
		
		return root;
	}	
	
	
	
	public static void main(String[] args)
	{
		int [] arr = {50,30,20,40,70,60,80};

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
		BinarySearchTreePractise bst = new BinarySearchTreePractise();
		BinaryTreeNode root = new BinaryTreeNode(arr[0]);
		for(int i = 1;i<arr.length;i++)
		{
			root = bst.insertNode(root, arr[i]);
		}
		System.out.println("InOrder");
		//bst.inOrder(root);
		System.out.println("preOrder");
		//bst.preOrder(root);
		System.out.println("postOrder");
		//bst.postOrder(root);
		//System.out.println(bst.count);
		System.out.println("levelOrder");
		bst.levelOrder(root);
		/*Find 2 trees are identical*/
		int [] arr2 = {50,30,20,40,70,60};
		BinaryTreeNode root2 = new BinaryTreeNode(arr2[0]);
		for(int i = 1;i<arr2.length;i++)
		{
			root2 = bst.insertNode(root2, arr2[i]);
		}
		
		boolean result = bst.checkIdentical(root,root2);
		if(result)
		{
			System.out.println("Trees are identical");
		}
		else
		{
			System.out.println("Trees are not identical");
			
		}
		
		/*height-Max depth of the tree*/
		int height = bst.calculateHeight(root);
		System.out.println("Height of the tree"+height);
		
		
		/*Search an element in BST*/
		
		BinaryTreeNode res = bst.searchBST(root,70);
		if(res != null)
		{
		System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
		
		/* Check whether two trees are mirror of one another*/
		boolean result1 = bst.checkMirror(root,root2);
		if(result1)
		{
			System.out.println("Trees are Mirrors");
		}
		else
		{
			System.out.println("Trees are not Mirror");
			
		}
		/*Calculate size of leaf nodes*/
		int size = bst.sizeOfLeaf(root);
		System.out.println("Size of leaf nodes:"+size);
		
		
		/*Calculate sum of all the nodes*/
		int sum = bst.sumOfTree(root);
		System.out.println("Sum of all the nodes:"+sum);
		
		/*Calculate size of leaf nodes*/
		int total = bst.totalNoNodes(root);
		System.out.println("Size of nodes:"+total);
		
		
		/*Least common ancestor*/
		
		BinaryTreeNode res1 = bst.LCA(root,40,20 );
		if(res1 !=null)
			System.out.println(res1.getData());
		
	}
	
}
