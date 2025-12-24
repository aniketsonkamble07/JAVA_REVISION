import java.util.*;
public class BinaryTree
{
	BinaryTree()
	{
		
	}
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
		}	
	}
	 Node root;
	
	public  void populate(Scanner sc)
	{
		System.out.println("Enter root node");
		int value=sc.nextInt();
		root=new Node(value);
		populate(sc, root);
	}
	public void populate(Scanner sc, Node node)
	{
		boolean left;
		System.out.println(" Do you want enter left node of "+ node.data);
		left=sc.nextBoolean();
		
		if(left)
		{
			System.out.println("Enter the left node value of "+ node.data);
			int value=sc.nextInt();
			node.left=new Node(value);
			populate(sc, node.left);
		}
		boolean right;
		System.out.println(" Do you want enter right node of "+ node.data);
		right=sc.nextBoolean();
		
		if(right)
		{
			System.out.println("Enter the right node of "+ node.data);
			int value=sc.nextInt();
			node.right=new Node(value);
			populate(sc, node.right);
		}
	}
	
	public void display()
	{
		inorder(root);
	}
	public void inorder(Node node)
	{
		if(node==null)
			return ;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	public void preorder(Node node)
	{
		if(node==null)
			return;
		System.out.println(node.data+ "  ");
		preorder(node.left);
		preorder(node.right);
	}
	public void postorder(Node node)
	{
		if(node==null)
			return ;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data +" ");
	}
}