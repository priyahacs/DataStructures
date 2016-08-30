package Trees;

public class BinarySearchTreePractise {
	
	int count = 0;
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
			inOrder(root.getLeft());
			inOrder(root.getRight());
		}
		
	}
	
	
	/*left-right-root*/
	public void postOrder(BinaryTreeNode root)
	{
		if(root !=null )
		{
			inOrder(root.getLeft());
			inOrder(root.getRight());
			System.out.println(root.getData());
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
		bst.inOrder(root);
		System.out.println("preOrder");
		//bst.preOrder(root);
		System.out.println("postOrder");
		//bst.postOrder(root);
		System.out.println(bst.count);
		
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
		
	}
	
}
