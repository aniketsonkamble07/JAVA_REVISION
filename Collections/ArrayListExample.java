import java.util.*;
import java.util.Collection;
public class ArrayListExample
{
     ArrayList l1=new ArrayList();
     ArrayList l2=new ArrayList(10);
int[] arr={10,20,300};
ArrayList l3;
List l4=new ArrayList();
ArrayList<String> names=new ArrayList<String>();

public void Operations()
{
	l2.add(41);
	l2.add(1,17);
	l3=new ArrayList(l2);
	l3.add(12);
	l3.add(20);
	l3.add(34);
	l3.add(85);
	
	names.add("Sham");
	names.add("Ram");
	names.add("Nitin");
	names.add(2,"Rohini");
	System.out.println("List 3 Elements are::");
	for(int i=0;i<l3.size();i++)
	{
		System.out.print(l3.get(i)+"\t");
	}
	
	System.out.println("\n foreach loop");
	for(var element:l3)
	{
		System.out.print(element+"\t");
	}
	
	System.out.println("Name List");
	for(var name : names)
	{
		System.out.print(name+"\t");
	}
	System.out.println("\n"+ names.contains("Rohini"));
	System.out.println(names.set(1,"Roshni"));
	System.out.println(names.remove(0));
	
	
}	 
}