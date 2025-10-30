import java.util.*;
import java.util.Collections;
public class HashMapExample
{
	HashMap<Integer, String>  m1=new HashMap<Integer, String> ();
	HashMap<Integer, String>  m2=new HashMap<Integer, String> (10);
	HashMap<Integer, String>  m3=new HashMap<Integer, String> (m2);
	
	public void HashMapOperations()
	{
		m1.put(101, "a");
		m1.put(102, "b");
		
		System.out.println("HashMap elements Are:");
		System.out.println(m1);
		for(Map.Entry<Integer, String> entry: m1.entrySet())
		{
			System.out.println("Key:"+entry.getKey() +"Value: "+ entry.getValue());
		}
		Set keys=m1.keySet();
		Collection c=m1.values();
		System.out.println(keys);
		System.out.println(c);
	}
}