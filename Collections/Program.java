import java.util.*;
public class Program
{
	public static void main(String[] args)
	{
		ArrayListExample l=new ArrayListExample();
		//l.Operations();
		
		LinkedListExample l2=new LinkedListExample();
		//l2.LinkedListOperations();
		
		HashMapExample l3=new HashMapExample();
		//l3.HashMapOperations();
		HashTableExample l4=new HashTableExample();
		//l4.HashTableOperations();
		EvenExample even=new EvenExample();
		even.findEven();
		even.findDuplicate();
	}
}