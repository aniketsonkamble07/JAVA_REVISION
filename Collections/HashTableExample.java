import java.util.*;
import java.util.Collections;
public class HashTableExample
{
	Hashtable<Integer, String> t1=new Hashtable<>();
	Hashtable<Integer, String> t2=new Hashtable<>(20);
	Hashtable<Integer, String> t3=new Hashtable<>(t2);
	
	public void HashTableOperations()
	{
	t1.put(101, "a");
t1.put(102, "b");
t1.put(103, "c");


System.out.println(t1.containsKey(101));
System.out.println(t1.containsValue("b"));
System.out.println(t1.remove(101));
System.out.println(t1.get(102));
System.out.println(t1.isEmpty());
	
	}
}