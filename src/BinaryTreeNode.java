package Trees;

public class BinaryTreeNode{
	
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
	
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setLeft(BinaryTreeNode n)
	{
		this.left = n;
	}
	public void setRight(BinaryTreeNode n)
	{
		this.right = n;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	BinaryTreeNode getLeft()
	{
		return this.left;
	}
	
	BinaryTreeNode getRight()
	{
		return this.right;
	}
}


