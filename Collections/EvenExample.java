import java.util.*;
import java.util.Collection;

public class EvenExample
{
	List<Integer> l1=new ArrayList<>();
	
	public void findEven()
	{
		l1.add(12);
		l1.add(13);
		l1.add(5);
		l1.add(56);
		l1.add(12);
		l1.add(56);
		
		System.out.println("Even numbers:");
		for(var num: l1 )
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		
		Collections.reverse(l1);
		System.out.println("List after reverse");
		for(int num : l1)
		{
			System.out.println(num);
		}
		
		System.out.println("Sorted List:");
		Collections.sort(l1);
		for(int num : l1)
		{
	      	System.out.println(num);
		}
	}
	public void findDuplicate()
	{
		for(int i=0;i<l1.size();i++)
		{
			for(int j=1;j<l1.size();j++)
			{
				if(l1.get(i)==l1.get(j))
				{
					l1.remove(l1.get(i));
				}
			}
		}
		
		System.out.println("After removing duplicate");
		for(int num : l1)
		{
	      	System.out.println(num);
		}
	}
	
	public void findDuplicate2() {
    Set<Integer> s = new LinkedHashSet<>(); 

    for (int num : l1) {
        s.add(num);
    }

    // Update l1 to contain unique elements only (optional but good practice)
    l1.clear();
    l1.addAll(s);

    System.out.println("After removing duplicates:");
    for (int num : l1) {
        System.out.println(num);
    }
}
public void findDuplicate3() {
    l1 = new ArrayList<>(new LinkedHashSet<>(l1));

    System.out.println("After removing duplicates:");
    l1.forEach(System.out::println);
}

public void converArray()
{
	int[] arr=l1.toArray(new int[0]);
	
}


public void rotate(int k)
{
	 ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(12, 4, 56, 8, 98, 23, 90));
	int[] arr=new int[k];
	k=k%l2.size();
	for(int i=0;i<k;i++)
	{
		arr[i]=l2.get(0);
		l2.remove(0);
	}
	
	for(int i=0;i<k;i++)
	{
		l2.add(arr[index]);
		
	}
	
	for(int ele: l2)
	{
		System.out.println(ele);
	}
}

} 
