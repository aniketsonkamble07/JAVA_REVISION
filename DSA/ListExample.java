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
		List<Student> l1=new ArrayList<>();
		
		for(var num : l)
		{
			int n=(int)num;
			if(n==2)
			{
				System.out.println("Hi");
			}
		}
		
		l.sort((s1,s2)->Integer.compare(s1,s2));
		System.out.println("List After sort");
		for(var n: l)
		{
			System.out.println(n);
		}
		
		l.sort((s1,s2)->{
			int result=Integer.compare(s1.marks,s2.marks);
			if(result==0)
			{
				result=s1.name.compareTo(s2.name)
			}
			return result;
		});
	}
}

public class MyComparator implements Comparator<Student>
{
	
	public int compare(student s1, student s2)
	{
		return s1.name.CompareTo(s2.name);
	}
	
	public int compare(Student s1, Student s2)
	{
		return Integer.compare(s1.marks,s2.marks);
		// return Integer.compare(s2.marks, s1.marks);
	}
}

public class Student implements Comparable<Student>
{
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks;
	}
	
	public int compareTo(Student s)
	{
		
		return this.name.compareTo(s.name);
	}
	
	public int compareTo(Student s)
	{
		return Integer.compare(this.marks, s.marks);
	}
}



public class Demo
{
	public static void Op1()
	{
		List<Student> l=new ArrayList<>();
		
		l.sort((s1,)->);
	}
}