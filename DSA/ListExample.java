import java.util.*;
import java.util.Collection;
public class ListExample
{
	public static void main(String[] args)
	{
		ListOperations();
		
	}
	public static void ListOperations()
	{
		List l=new ArrayList();
		l.add(12);
		l.add(2);
		l.add(6);
		
		for(int num : l)
		{
			if(num==2)
			{
				System.out.println("Hi");
			}
		}
	}
}