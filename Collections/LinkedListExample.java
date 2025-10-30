import java.util.*;
import java.util.Collections;

public class LinkedListExample
{
	List l1=new LinkedList();
	LinkedList l2=new LinkedList();
	LinkedList l3;
	LinkedList<String> names=new LinkedList<>();
	
	public void LinkedListOperations()
	{
		l2.add(10);
		l2.add(20);
		l2.add(1,30);
		l2.add(0,100);
		l2.addFirst(1);
		l2.addLast(80);
		
		l3=new LinkedList(l2);
		System.out.println("List 3 Elements :");
		for(var element: l3)
		{
			System.out.print(element+"\t");
		}
		System.out.println(l3.size());
		System.out.println(l3.contains(100));
		System.out.println(l3.getFirst());
		System.out.println(l3.getLast());
		System.out.println(l3.removeFirst());
		System.out.println(l3.removeLast());
		
		
	}
}