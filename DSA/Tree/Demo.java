import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		BinaryTree tree=new BinaryTree();
		Scanner sc=new Scanner(System.in);
		tree.populate(sc);
		tree.display();
	}
}